<template>
  <div>
    <el-form :model="owner">
      <el-form-item label="所属小区ID" :label-width="formLabelWidth">
        <el-input v-model="owner.communityId" autocomplete="off" />
      </el-form-item>
      <el-form-item label="车牌号" :label-width="formLabelWidth">
        <el-input v-model="owner.carId" autocomplete="off" />
      </el-form-item>
      
      <el-form-item label="所属单元楼" :label-width="formLabelWidth">
        <el-input v-model="owner.cell" autocomplete="off" />
      </el-form-item>
      <el-form-item label="所属门牌号" :label-width="formLabelWidth">
        <el-input v-model="owner.doorId" autocomplete="off" />
      </el-form-item>
      <el-form-item label="所属房屋面积" :label-width="formLabelWidth">
        <el-input v-model="owner.homeSquare" autocomplete="off" />
      </el-form-item>
    </el-form>
    <el-button @click="handle_add">提交</el-button>
  </div>
</template>

<script setup lang="ts">
import { reactive, ref, watch } from 'vue'
import { update } from '../../api/owner';
import { add_owner } from '../../type/owner';
const formLabelWidth = "120px"


const owner = ref<add_owner>({
  'carId': "",
  "cell": "",
  "communityId": "",
  "doorId": "",
  "homeSquare":"",
  "userId":"",
})

async function handle_add() {
  owner.value.userId = localStorage.getItem("userId") as string;
  const data = await update(owner.value)
  
  console.log(data);
  
}

</script>


<style scoped lang="less">

</style>
