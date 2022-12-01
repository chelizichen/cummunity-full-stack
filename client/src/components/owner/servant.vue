<template>
  <div class="box">
    <el-card class="box-card">
      <template #header>
        <div class="card-header">
          <span>服务列表</span>
          <el-button class="button" text>Operation button</el-button>
        </div>
      </template>
      <div v-if="props.servant">
        <div v-for="item in props.servant" class="servant_item">
          <div>{{item.desc}}</div>
          <div>{{ getStatus(item.status)}}</div>
        </div>
      </div>
    </el-card>
  </div>
</template>

<script setup lang="ts">
import { servant__table, servant_status } from '../../type/servant';

// 个人服务列表
const props = defineProps<{
  servant:servant__table[]
}>()

function getStatus(status: string) {
  if (status == "0") {
    return "待处理"
  }
  if (status == "1") {
    return "已处理"
  }
  if (status == "2") {
    return "处理完成"
  }

}

</script>

<style scoped lang="less">
.space_between {
      display: flex;
      align-items: center;
      justify-content: space-between;
    }
.box {
  padding: 10px 5%;

  
    .servant_item {
      .space_between();
    }
}
</style>