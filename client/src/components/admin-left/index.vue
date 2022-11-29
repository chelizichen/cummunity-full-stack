<template>
  <el-menu   class="el-menu-vertical-demo" default-active="2"
    @select="handleSelect">
    <el-menu-item index="-1">
    <img :src="Logo"  style="width: 100%;height:50px;"/>
    </el-menu-item>
    <el-sub-menu index="1">
      <template #title>
        <el-icon>
          <location />
        </el-icon>
        <span>用户管理</span>
      </template>
        <el-menu-item index="user">用户列表</el-menu-item>
        <el-menu-item index="owner">业主列表</el-menu-item>
        <el-menu-item index="menu">菜单列表</el-menu-item>
        <el-menu-item index="port">车位列表</el-menu-item>
    </el-sub-menu>
    <el-menu-item index="2">
      <el-icon>
        <icon-menu />
      </el-icon>
      <span>Navigator Two</span>
    </el-menu-item>
    <el-menu-item index="3" disabled>
      <el-icon>
        <document />
      </el-icon>
      <span>Navigator Three</span>
    </el-menu-item>
    <el-menu-item index="4">
      <el-icon>
        <setting />
      </el-icon>
      <span>Navigator Four</span>
    </el-menu-item>
  </el-menu>

</template>

<script setup lang="ts">
import {
  Document,
  Menu as IconMenu,
  Location,
  Setting,
} from '@element-plus/icons-vue'
import { useRouter } from 'vue-router';
import Logo from '/Logo.jpeg'
const router = useRouter()

const handleSelect = (key: string, keyPath: string[]) => {
  if (key != "-1") {
    router.push("/admin/" + key)
    
  } else {
    router.replace("/home")
  }
}

</script>


<style scoped lang="less">

</style>
