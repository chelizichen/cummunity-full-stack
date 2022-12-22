<template>
  <div>
    <el-form :model="form" label-width="120px">
      <el-form-item label="地址">
        <el-input v-model="form.address" />
      </el-form-item>
      <el-form-item label="服务类型">
        <el-select v-model="form.servantType">
          <el-option label="普通" value="1" />
          <el-option label="投诉" value="2" />
        </el-select>
      </el-form-item>
      <el-form-item label="是否加急">
        <el-switch v-model="form.weight" />
      </el-form-item>
      <el-form-item label="服务描述">
        <el-input v-model="form.desc" type="textarea" />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="onSubmit">Create</el-button>
        <el-button>Cancel</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script setup lang="ts">
import { update } from '../../../api/servant';
import { reactive } from 'vue'
import { servant__table } from '../../../type/servant';
import { ElForm, ElFormItem, ElInput, ElSelect, ElOption, ElSwitch, ElButton } from 'element-plus';
import useUserInfoStore from '../../../store/userInfo';

const form = reactive({
  permission: "",
  address: "",
  desc: "",
  servantType: "",
  status: "",
  weight: true,
  communityId: "",
  userId: "",
})
const infoStore = useUserInfoStore()

const onSubmit = async () => {
  // @ts-ignore
  form.userId = infoStore.user_info?.id
  // @ts-ignore
  form.permission = infoStore.user_info?.permission
  // @ts-ignore
  form.communityId = infoStore.owner_info?.communityId;
  form.status = "0"
  if (form.weight) {
  // @ts-ignore
    form.weight = "1"
  } else {
  // @ts-ignore
    form.weight = "0"
  }
  // @ts-ignore
  const data = await update(form)
  console.log(data);

  console.log(form);
  
}

</script>

<style scoped>

</style>