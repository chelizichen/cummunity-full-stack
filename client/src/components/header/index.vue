
<template>
  <el-header>
    <el-menu :default-active="activeIndex" class="menu" mode="horizontal" :ellipsis="false" @select="handleSelect">
      <el-menu-item index="0">LOGO</el-menu-item>
      <div class="flex-grow" />
      <el-menu-item index="1">主页</el-menu-item>
      <el-menu-item index="2">用户</el-menu-item>
      <el-menu-item index="3">管理员</el-menu-item>
      <el-menu-item index="4">案例</el-menu-item>
      <el-menu-item index="5">联系我们</el-menu-item>
    </el-menu>
  </el-header>
</template>

<script setup lang="ts">
import { ref } from 'vue'

const activeIndex = ref('1')
const handleSelect = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}
</script>


<style scoped lang="less">
.menu{
  .flex-grow {
      flex-grow: 1;
  }
  ::v-deep(.is-active){
      color: red !important;
      // border-bottom: none;
      border-bottom: 2px solid red;
  }
  ::v-deep(.el-sub-menu:hover){
          color: red !important;
  }
  ::v-deep(.el-menu-item:not(.is-disabled):hover){
    color:red;
  }
}
// ::v-deep(.menu > .is-active ){
//   color: red !important;
//   border-bottom: none;
//   border-top: 2px solid red;
// }
// .menu /deep/ .is-active{
//   color: red;
// }
</style>
