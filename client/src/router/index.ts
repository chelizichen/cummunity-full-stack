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
    component:()=>import("@/pages/home/index.vue")
  },
  {
    path: "/login",
    component:()=>import("@/pages/login/index.vue")
  },
  {
    path: "/owner",
    component:()=>import("@/pages/owner/index.vue")
  }

]

const router = createRouter({
  routes,
  history:createWebHistory()
})

export default router