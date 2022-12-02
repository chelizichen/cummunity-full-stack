<template>
  <el-menu class="el-menu-vertical-demo" default-active="2" @select="handleSelect">
    <el-menu-item index="-1">
      <img :src="Logo" style="width: 100%;height:50px;" />
    </el-menu-item>
    <el-sub-menu v-for="item in Items" :index="item.path">
      <template #title>
        <el-icon>
          <location />
        </el-icon>
        <span>{{item.name}}</span>
      </template>
      <el-menu-item v-for="child in item.children" :index="child.path">{{ child.name}}</el-menu-item>
    </el-sub-menu>
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
import useMenuStore from '../../store/menu';
import { computed } from 'vue'
import Logo from '/Logo.jpeg'
const router = useRouter()


const menuStore = useMenuStore()
const Items = computed(() => menuStore.menu)

console.log('item',Items.value);


const handleSelect = (key: string, keyPath: string[]) => {
  if (key != "-1") {
    console.log(keyPath);
    const path = keyPath[0] + '/' + keyPath[1]
    router.push(path)

  } else {
    router.replace("/home")
  }
}

</script>


<style scoped lang="less">

</style>
