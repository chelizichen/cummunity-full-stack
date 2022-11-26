import {RouteRecord,createRouter,createWebHistory} from 'vue-router'

const routes: RouteRecord[] = []

const router = createRouter({
  routes,
  history:createWebHistory()
})

export default router