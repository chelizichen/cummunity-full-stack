<template>
  <!-- 选项 -->
  <div>
        <el-button type="primary" size="small" @click="handle_add">添加</el-button>
  </div>
  <!-- 表格 -->
  <div>
    <el-table :data="state.list" style="width: 100%">
      <el-table-column prop="id" label="ID" />
      <el-table-column prop="communityId" label="社区ID" />
      <el-table-column prop="desc" label="描述" />
      <el-table-column prop="address" label="地址" />
      <el-table-column prop="permission" label="权限" />
      <el-table-column prop="servantType" label="服务类型" />
      <el-table-column prop="status" label="服务状态" />
      <el-table-column prop="userId" label="用户ID" />
      <el-table-column prop="weight" label="权重" />
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
import { list,del } from '../../api/servant';
import { Pagination } from '../../type/common.d'
import Edit from './edit.vue'
import _ from 'lodash'
import { ElNotification } from 'element-plus';
import { servant__table } from '../../type/servant';
const state = reactive({
  list:<Array<servant__table>>[]
})

const pagination = ref<Pagination>({
  size: 10,
  keyword: "",
  page: 1
})

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

async function handle_del(item: servant__table) {
  const data = await del({ id: item.id })
  // @ts-ignore
  if (data.code == 0) {
    //删除成功函数    
    init()
  }
  
}

async function init() {
  const data = await list(pagination.value)
  console.log(data);
  
  state.list = data.data
}

onMounted( () => {
  init()
})

</script>

<style scoped>

</style>