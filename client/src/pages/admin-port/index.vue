<template>
  <!-- 选项 -->
  <div>
        <el-button type="primary" size="small" @click="handle_add">添加</el-button>
  </div>
  <!-- 表格 -->
  <div>
    <el-table :data="state.list" style="width: 100%">
      <el-table-column prop="id" label="ID" />
      <el-table-column prop="portPermission" label="停车所需权限" />
      <el-table-column prop="portArea" label="停车区域" />
      <el-table-column prop="portSum" label="停车位总量" />
      <el-table-column prop="portManagerId" label="管理者ID" />
      <el-table-column prop="portCommunityId" label="社区ID" />
      <el-table-column prop="portIsOpen" label="是否打开" />
      <el-table-column prop="portIsBespeak" label="是否被预约" />
      <el-table-column prop="portCarId" label="车牌号" />
      <el-table-column prop="portUserId" label="用户ID" />
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
import { list,del, getCarPortListByCommunityId } from '../../api/port';
import { Pagination } from '../../type/common.d'
import Edit from './edit.vue'
import _ from 'lodash'
import { ElNotification } from 'element-plus';
import { car_port__table } from '../../type/car_port';
import store from '../../store';
const state = reactive({
  list:<Array<car_port__table>>[]
})

const { useUserInfoStore } = store;

const pagination = ref<Pagination>({
  size: 10,
  keyword: "",
  page: 1
})
// getCarPortListByCommunityId
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

async function handle_del(item: car_port__table) {
  const data = await del({ id: item.id })
  // @ts-ignore
  if (data.code == 0) {
    //删除成功函数    
    init()
  }
  
}

async function init() {

  console.log(useUserInfoStore.user_info);

  if (Number(useUserInfoStore.user_info?.permission) < 5) {
    const community_id = useUserInfoStore.owner_info?.communityId as string;
    const data = await getCarPortListByCommunityId({ community_id })
    state.list = data.data;
  } else {
    const data = await list(pagination.value)
    state.list = data.data
  }
  
}

onMounted( () => {
  init()
})

</script>

<style scoped>

</style>