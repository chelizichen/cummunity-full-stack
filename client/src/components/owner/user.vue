<template>
  <div class="box">
    <el-card class="box-card">
      <template #header>
        <div class="card-header">
          <span>用户信息</span>
          <el-button class="button" @click="handle_update_user">更新用户信息</el-button>
        </div>
      </template>
      <div v-if="user">
        <el-form :model="user" label-width="auto">
          <el-form-item label="姓名：">
            <el-input v-model="user.username" :disabled="state.user_able" />
          </el-form-item>
          <el-form-item label="电话号码：">
            <el-input v-model="user.phone" :disabled="state.user_able" />
          </el-form-item>
          <el-form-item label="电子邮箱">
            <el-input v-model="user.email" :disabled="state.user_able" />
          </el-form-item>
          <el-form-item label="权限：">
            <el-input v-model="user.permission" :disabled="state.user_able" />
          </el-form-item>
          <el-form-item label="创建时间：">
            <el-input v-model="user.createTime" :disabled="state.user_able" />
          </el-form-item>


        </el-form>
      </div>
    </el-card>

    <el-card class="box-card">
      <template #header>
        <div class="card-header">
          <span>业主信息</span>
          <el-button class="button" @click="handle_update_owner">更新业主信息</el-button>
        </div>
      </template>
      <div v-if="owner">
        <el-form :model="owner" label-width="auto">
          <el-form-item label="社区ID">
            <el-input v-model="owner.communityId" :disabled="state.owner_able" />
          </el-form-item>
          <el-form-item label="单元">
            <el-input v-model="owner.cell" :disabled="state.owner_able" />
          </el-form-item>
          <el-form-item label="个人车牌号：">
            <el-input v-model="owner.carId" :disabled="state.owner_able" />
          </el-form-item>
          <el-form-item label="房屋号：">
            <el-input v-model="owner.doorId" :disabled="state.owner_able" />
          </el-form-item>
          <el-form-item label="房间面积：">
            <el-input v-model="owner.homeSquare" :disabled="state.owner_able" />
          </el-form-item>
        </el-form>
      </div>
    </el-card>
  </div>
</template>

<script setup lang="ts">
import { owner__table } from '../../type/owner';
import { user as user__table } from '../../type/user';
import { reactive, ref } from 'vue'
import { update } from '../../api/owner';
import { update as updateUser } from '../../api/user'
import useUserInfoStore from '../../store/userInfo';

const state = reactive({
  user_able: true,
  owner_able: true,
})
// @ts-ignore
const user = ref<user__table>(useUserInfoStore().user_info)
// @ts-ignore
const owner = ref<owner__table>(useUserInfoStore().owner_info)

const own_setp_class = ref(0)
const user_setp_class = ref(0);

function handle_update_owner() {
  if (own_setp_class.value == 0) {
    own_setp_class.value++
    state.owner_able = false
  } else {
    own_setp_class.value = 0;
    state.owner_able = true
    update(owner.value)
  }
}

function handle_update_user() {
  if (user_setp_class.value == 0) {
    user_setp_class.value++
    state.user_able = false
  } else {
    user_setp_class.value = 0;
    state.user_able = true
    updateUser(user.value)
  }
}





</script>

<style scoped lang="less">
.box {
  padding: 5px 5%;

  .box-card {
    margin: 20px 0;
  }

}
</style>