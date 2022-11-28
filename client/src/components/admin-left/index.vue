<template>
  <el-menu active-text-color="#ffd04b" background-color="gray" class="el-menu-vertical-demo" default-active="2"
    text-color="#fff" @select="handleSelect">
    <el-menu-item index="-1">
      <el-icon>
        <icon-menu />
      </el-icon>
      <span>首页</span>
    </el-menu-item>
    <el-sub-menu index="1">
      <template #title>
        <el-icon>
          <location />
        </el-icon>
        <span>用户管理</span>
      </template>
        <el-menu-item index="user">查看用户</el-menu-item>
        <el-menu-item index="owner">查看业主</el-menu-item>
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
