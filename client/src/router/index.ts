import {RouteRecord,createRouter,createWebHistory, RouteRecordRaw} from 'vue-router'
import { getOne } from '../api/owner';
import { getOne as getOneByUserId } from "../api/user";

import useUserInfoStore from '../store/module/userInfo';


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
  // {
  //   path: "/login",
  //   component: () => import("@/pages/login/index.vue"),
  // },
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
      {
        path: "user",
        component: () => import("@/pages/admin-user/index.vue"),
      },
      {
        path: "owner",
        component: () => import("@/pages/admin-owner/index.vue"),
      },
      {
        path: "menu",
        component: () => import("@/pages/admin-menu/index.vue"),
      },
      {
        path: "port",
        component: () => import("@/pages/admin-port/index.vue"),
      },
      {
        path: "servant",
        component:()=>import("@/pages/admin-servant/index.vue")
      }
    ],
  },
];


const router = createRouter({
  routes,
  history:createWebHistory()
})


router.beforeEach(async (to, from, next) => {

  const userStore = useUserInfoStore()
  let userId = userStore.getUserId() as string;
  if (!userId || !userStore.user_info || !userStore) {
      const user_data = await getOneByUserId({ id: userId });
    const owner_data = await getOne({ id: userId });
    console.log(user_data.data);
    console.log(owner_data.data);
    
      userStore.setUserInfo(user_data.data);
      userStore.setOwnerInfo(owner_data.data);
  }
  console.log(userStore.user_info);
  console.log(userStore.owner_info);
  
  
  if (to.path == "/owner") {
    if (!userStore.getUserId()) {
      next({
        path: "/login",
      });
    } else {
      next()
    }
  } else {
    next()
  }
  // if( to.path == "")

})

export default router