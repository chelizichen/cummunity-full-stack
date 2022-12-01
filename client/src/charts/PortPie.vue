<template>
  <div class="pie" ref="chart"></div>
</template>

<script setup lang="ts">
import { ref, reactive, onMounted, watch, onUpdated } from 'vue'
import * as Echarts from 'echarts'
import { car_port__table } from '../type/car_port';

const props = defineProps<{
  port:car_port__table[]
}>();

watch(props,function(newVal){
  console.log('newVal.port1', newVal.port);
  let data = [{ value: 0, name: "未预约" },{ value: 0, name: "已预约" }]
  newVal.port.forEach(el => {
    
    if (el.portIsBespeak == "0") {
      data[0].value ++
    } 
    if (el.portIsBespeak == "1") {
      data[1].value ++
    }
  })
  state.echarts_data = data;
  options.value.series[0].data = state.echarts_data

})

const state = reactive({
  echarts_data: [] as Array<any>,
  myChart: null as any
})

const options = ref({
  tooltip: {
    trigger: 'item'
  },
  legend: {
    top: '5%',
    left: 'center'
  },
  series: [
    {
      name: 'Access From',
      type: 'pie',
      radius: ['40%', '70%'],
      avoidLabelOverlap: false,
      label: {
        show: false,
        position: 'center'
      },
      emphasis: {
        label: {
          show: true,
          fontSize: '40',
          fontWeight: 'bold'
        }
      },
      labelLine: {
        show: false
      },
      data:state.echarts_data
    }
  ]
})

const chart = ref<HTMLDivElement>({} as HTMLDivElement)
onUpdated(() => {
  console.log('state.echarts_data', state.echarts_data);
  
  state.myChart = Echarts.init(chart.value)
  state.myChart.setOption(options.value)
})
onMounted(() => {
  state.myChart = Echarts.init(chart.value)
  state.myChart.setOption(options.value)
})
</script>

<style scoped>
.pie{
  width: 100%;
  height: 200px;
}
</style>