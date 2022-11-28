<template>
  <!-- 选项 -->
  <div>
    user
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
      <el-table-column prop="password" label="操作" />

    </el-table>
    </div>
</template>

<script setup lang="ts">
import { onMounted, reactive } from 'vue';
import { list } from '../../api/user';
import { user } from '../../type/user';

const state = reactive({
  list:<Array<user>>[]
})


onMounted(async () => {
  const data = await list()
  state.list = data.data
  console.log(state.list);
  
})

</script>

<style scoped>

</style>