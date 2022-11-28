
<template>
  <router-view></router-view>
</template>

<script setup lang="ts">
import { reactive, nextTick, provide } from 'vue';

const state = reactive({
  isRouterView:true
})

function reload(){
  state.isRouterView = false
  nextTick(()=>{
    state.isRouterView = true
  })
}

provide("reload",reload)

</script>

<style scoped lang="less">
</style>
