<template>
  <div>
    <el-card class="box-card">
      <template #header>
        <div class="card-header">
          <span>车位预约</span>
          <el-button class="button" text>更新车位信息</el-button>
          <el-button class="button" text>预约车位</el-button>
        </div>
      </template>
      <PortPie :port="props.port"></PortPie>
      <!-- <div v-if="props.servant">
        <div v-for="item in props.servant" class="servant_item">
          <div>{{  item.desc  }}</div>
          <div>{{ getStatus(item.status)  }}</div>
        </div>
      </div> -->
    </el-card>
  </div>
</template>

<script setup lang="ts">
import PortPie from '../../charts/PortPie.vue';
import { car_port__table } from '../../type/car_port';


// 个人服务列表
const props = defineProps<{
  port: car_port__table[]
}>()


</script>

<style scoped lang="less">
.space_between {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.servant_item {
  .space_between();
}
</style>