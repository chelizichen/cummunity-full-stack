import {
  RouteRecord,
  createRouter,
  createWebHistory,
  RouteRecordRaw,
} from "vue-router";
import { ApiRouterMenu } from "../api/menu";
import { getOne } from "../api/owner";
import { getOne as getOneByUserId } from "../api/user";
import useUserInfoStore from "../store/userInfo";
import useMenuStore from "../store/menu";

/**
 * 判断是否有业主 token
 */

const routes: RouteRecordRaw[] = [
  {
    path: "/",
    redirect: "/home",
  },
  {
    path: "/home",
    redirect: "/home/intro",
  },
  {
    path: "/admin",
    redirect: "/admin/dashboard",
  },
  {
    path: "/home",
    component: () => import("@/pages/home/index.vue"),
    children: [
      {
        path: "intro",
        component: () => import("@/pages/intro/index.vue"),
      },
      {
        path: "login",
        component: () => import("@/pages/login/index.vue"),
      },
    ],
  },
  {
    path: "/owner",
    component: () => import("@/pages/owner/index.vue"),
  },
  {
    path: "/admin",
    component: () => import("@/pages/admin/index.vue"),
    children: [
      {
        path: "dashboard",
        component: () => import("@/pages/admin-dashboard/index.vue"),
      },
    ],
  },
];

const router = createRouter({
  routes,
  history: createWebHistory(),
});

router.beforeEach(async (to, from, next) => {
  const userStore = useUserInfoStore();
  const menuStore = useMenuStore();

  if (to.path == "/home/login") {
    next();
  } else {
    let userId = userStore.getUserId() as string;
    if (userId) {
      const { asyncRoutesMark, setAsyncRoutesMark, setAsyncRoutes, setMenu } =
        menuStore;
      if (asyncRoutesMark) {
        next();
      } else {
        const user_data = await getOneByUserId({ id: userId });
        const owner_data = await getOne({ id: userId });
        userStore.setUserInfo(user_data.data);
        userStore.setOwnerInfo(owner_data.data);
        const permission = userStore.user_info?.permission as string;
        const menu = await ApiRouterMenu({ permission });
        const filterMenu = setAsyncRoutes(menu.data);
        setMenu(filterMenu);
        filterMenu.forEach((el) => {
          // @ts-ignore
          router.addRoute(el);
        });
        setAsyncRoutesMark(true);
        next({ ...to, replace: true });
      }
    } else {
      next("/home/login");
    }
  }

  console.log(router.getRoutes());
});

export default router;
