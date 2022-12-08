<template>
  <!-- 选项 -->
  <div>
        <el-button type="primary" size="small" @click="handle_add">添加</el-button>
  </div>
  <!-- 表格 -->
  <div>
    <el-table :data="state.list" style="width: 100%">
      <el-table-column prop="id" label="ID" width="50" />
      <el-table-column prop="menuName" label="权限" width="180" />
      <el-table-column prop="menuPermission" label="菜单权限" >
        <template #default="scope">
          <div v-for="item in scope.row.menuPermission" >{{ getPermissionName(item)}}</div>
        </template>
      </el-table-column>
      <el-table-column prop="menuIsRoot" label="是否为外层菜单" >
      <template #default="scope">
          <div>{{scope.row.menuIsRoot == "0 "?"否":"是"}}</div>
        </template>
      </el-table-column>
      <el-table-column prop="menuRootId" label="外层菜单ID" />
      <el-table-column prop="menuPath" label="菜单路由" />
      <el-table-column prop="menuComponent" label="菜单组件" />
      <el-table-column prop="createTime" label="创建时间" />
      <el-table-column  label="操作">
      <template #default="scope">
        <el-button  type="primary" size="small" @click="handle_edit(scope.row)">编辑</el-button>
        <el-popconfirm title="Are you sure to delete this?" @confirm="handle_del(scope.row)">
          <template #reference>
              <el-button  type="danger" size="small">删除</el-button>
          </template>
        </el-popconfirm>

      </template>
      </el-table-column>
    </el-table>
    </div>
    <Edit 
    :dialogFormVisible="dialogFormVisible"  
    :val="dialogVal"
    @close="handle_close"
    @success="handle_success"
    ></Edit>
</template>

<script setup lang="ts">

import { onMounted, reactive,ref } from 'vue';
import { del,list } from '../../api/menu';
import Edit from './edit.vue'
import _ from 'lodash'
import { ElNotification } from 'element-plus';
import { menu__table } from '../../type/menu';
import useUserInfoStore from '../../store/userInfo';

const state = reactive({
  list:<Array<menu__table>>[]
})

function getPermissionName(item:string) {
  if (item == "5") {
    return "超级管理员"
  }
  if (item == "4") {
    return "停车场管理员"
  }
  if (item == "3") {
    return "保安 | 物业"
  }
  if (item == "2") {
    return "商家"
  }
  if (item == "1") {
    return "业主"
  }
}

const dialogFormVisible = ref(false)
const dialogVal =  ref<any>()
function handle_close() {
  dialogFormVisible.value = false
}
function handle_success(args: any) {
  // Notification
  ElNotification({
    title: "通知",
    message:args
  })
  init()
}
function handle_edit(item:any) {
  dialogFormVisible.value = true
  const newItem = _.cloneDeep(item)
  dialogVal.value = newItem
}

function handle_add() {
  dialogFormVisible.value = true
  dialogVal.value = {}
}

async function handle_del(item:menu__table) {
  const data = await del({ id: item.id })
  // @ts-ignore
  if (data.code == 0) {
    //删除成功函数    
    init()
  }
  
}

async function init() {
  let permission = useUserInfoStore().user_info?.permission as string;
  const data = await list({permission})
  console.log('data', data);

  state.list = data.data
}

onMounted( () => {
  init()
})

</script>

<style scoped>

</style>