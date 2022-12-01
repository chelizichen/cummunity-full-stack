<template>
  <div class="box">
    <el-card class="box-card">
      <template #header>
        <div class="card-header">
          <span>用户信息</span>
          <el-button class="button" text>Operation button</el-button>
        </div>
      </template>
      <div v-if="props.user">
        <div>姓名：{{props.user.username}}</div>
        <div>电话号码：{{props.user.phone}}</div>
        <div>电子邮箱{{props.user.email}}</div>
        <div>权限：{{props.user.permission}}</div>
        <div>创建时间：{{props.user.createTime}}</div>
      </div>
    </el-card>

    <el-card class="box-card">
      <template #header>
        <div class="card-header">
          <span>业主信息</span>
          <el-button class="button" text>Operation button</el-button>
        </div>
      </template>
      <div v-if="props.owner">
        <div>社区ID：{{props.owner.communityId}}</div>
        <div>单元：{{props.owner.cell}}</div>
        <div>个人车牌号：{{props.owner.carId}}</div>
        <div>房屋号：{{props.owner.doorId}}</div>
        <div>房间面积：{{props.owner.homeSquare}}</div>
      </div>
    </el-card>
  </div>
</template>

<script setup lang="ts">
import { owner__table } from '../../type/owner';
import { user as user__table } from '../../type/user';

const props = defineProps<{
  user: user__table,
  owner:owner__table
}>()





</script>

<style scoped lang="less">
.box{
  padding: 5px 5%;
  .box-card{
    margin: 20px 0;
  }
}
</style>