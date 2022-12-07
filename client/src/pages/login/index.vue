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
  <button @click="toRegistry">注册</button>
</template>

<script setup lang="ts">
import { ref, reactive } from 'vue'
import { useRouter } from 'vue-router';

const router = useRouter()

const form = reactive({
  phone: '',
  password:"",
})

const toRegistry = () => {
  router.push("/home/registry")
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
