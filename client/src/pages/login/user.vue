<template>
  <div>
    <el-form :model="user">
      <el-form-item label="姓名" :label-width="formLabelWidth">
        <el-input v-model="user.username" autocomplete="off" />
      </el-form-item>
      <el-form-item label="密码" :label-width="formLabelWidth">
        <el-input v-model="user.password" autocomplete="off" />
      </el-form-item>
      <el-form-item label="权限" :label-width="formLabelWidth">
        <el-input v-model="user.permission" autocomplete="off" />
      </el-form-item>
      <el-form-item label="电话号码" :label-width="formLabelWidth">
        <el-input v-model="user.phone" autocomplete="off" />
      </el-form-item>
      <el-form-item label="电子邮箱" :label-width="formLabelWidth">
        <el-input v-model="user.email" autocomplete="off" />
      </el-form-item>
    </el-form>
    <el-button @click="handle_add">提交</el-button>
  </div>
</template>

<script setup lang="ts">
import { add_user } from '../../type/user';
import { reactive, ref } from 'vue'
import { update } from '../../api/user';
const formLabelWidth = "120px"

const emit = defineEmits(["setDisable"])

const user = ref<add_user>({
  'email': "",
  "password": "",
  "permission": "",
  "phone": "",
  "username": ""
})

async function handle_add() {
  const data = await update(user.value)
  // @ts-ignore
  if (data.code == 0) {
    emit("setDisable")
    localStorage.setItem("userId",data.data)
  }
}

</script>


<style scoped lang="less">

</style>
