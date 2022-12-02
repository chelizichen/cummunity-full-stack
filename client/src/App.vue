
<template>
  <router-view></router-view>
</template>

<script setup lang="ts">
import { reactive, nextTick, provide } from 'vue';
import useMenuStore from './store/menu';

const state = reactive({
  isRouterView:true
})

function reload(){
  state.isRouterView = false
  nextTick(()=>{
    state.isRouterView = true
  })
}

const menuStore = useMenuStore()

window.addEventListener('beforeunload', e => beforeunloadFn(e))
const beforeunloadFn = (() => {
  menuStore.setAsyncRoutesMark(false)
})

provide("reload",reload)

</script>

<style scoped lang="less">
</style>
