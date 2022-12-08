<template>
  <div>
    <el-form :model="form">
      <el-form-item label="手机号" label-width="120px">
        <el-input v-model="form.phone" autocomplete="off" />
      </el-form-item>
      <el-form-item label="密码" label-width="120px">
        <el-input v-model="form.password" autocomplete="off" />
      </el-form-item>
    </el-form>
  </div>
  <el-button @click="toLogin">登陆</el-button>
  <el-button @click="toRegistry">注册</el-button>
</template>

<script setup lang="ts">
import { ref, reactive } from 'vue'
import { useRouter } from 'vue-router';
import { login } from '../../api/user';

const router = useRouter()

const form = reactive({
  phone: '',
  password:"",
})

const toRegistry = () => {
  router.push("/home/registry")
}

const toLogin = async () => {
  const data = await login(form)
  console.log(data);
  const user = data.data
  if (user instanceof Array && user.length > 0) {
    localStorage.setItem("userId", user[0].id)
    router.replace("/home")
  } else {
    alert("登陆失败")
  }
}

</script>


<style scoped lang="less">
.demo-tabs > .el-tabs__content {
  padding: 32px;
  color: #6b778c;
  font-size: 32px;
  font-weight: 600;
}
</style>
