<template>
  <!-- 选项 -->
  <div>
        <el-button type="primary" size="small" @click="handle_add">编辑</el-button>
  </div>
  <!-- 表格 -->
  <div>
    <el-table :data="state.list" style="width: 100%">
      <el-table-column prop="id" label="ID" width="180" />
      <el-table-column prop="username" label="用户名" width="180" />
      <el-table-column prop="password" label="咪嘛" />
      <el-table-column prop="email" label="电子邮箱" />
      <el-table-column prop="phone" label="电话" />
      <el-table-column prop="permission" label="权限" />
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
import { list,del } from '../../api/user';
import { user } from '../../type/user';
import Edit from './edit.vue'
import _ from 'lodash'
import { ElNotification } from 'element-plus';
const state = reactive({
  list:<Array<user>>[]
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

async function handle_del(item:user) {
  const data = await del({ id: item.id })
  // @ts-ignore
  if (data.code == 0) {
    //删除成功函数    
    init()
  }
  
}

async function init() {
  const data = await list(pagination.value)
  state.list = data.data
}

onMounted( () => {
  init()
})

</script>

<style scoped>

</style>