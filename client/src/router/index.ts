import {RouteRecord,createRouter,createWebHistory, RouteRecordRaw} from 'vue-router'


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
    path: "/login",
    component: () => import("@/pages/login/index.vue"),
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
        component: () => import("@/pages/dashboard/index.vue"),
      },
      {
        path: "user",
        component: () => import("@/pages/user/index.vue"),
      },
    ],
  },
];

const router = createRouter({
  routes,
  history:createWebHistory()
})

export default router