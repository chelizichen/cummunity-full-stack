<template>
  <div class="box">
    <el-card class="box-card">
      <template #header>
        <div class="card-header">
          <span>车位预约</span>
          <el-button class="button" @click="bespeakToPort" :disabled="state.canBespeak">预约车位</el-button>
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
import { updateBespeak } from '../../api/port';
import PortPie from '../../charts/PortPie.vue';
import { car_port__table } from '../../type/car_port';
import { reactive, watch, onMounted } from 'vue';

// 个人服务列表
const props = defineProps<{
  port: car_port__table[]
}>()

const state = reactive({
  canBespeak: false
})

watch(props, function (newVal) {
  if(newVal.port.every(el=>el.portIsBespeak == "1"))
  {
    state.canBespeak = true
  }
})




async function bespeakToPort() {
  const getOne = props.port.filter(el => {
    return el.portIsBespeak == "0"
  })[0]

  // @ts-ignore
  getOne.portCarId = useUserInfoStore().owner_info?.carId;
  // @ts-ignore
  getOne.portUserId = useUserInfoStore().owner_info?.userId;
  getOne.portIsBespeak = "1"

  console.log('getOne', getOne);
  
  const data = await updateBespeak(getOne)
  if (data.data == 1) {
    // 成功预约
  }
  // if(data)
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