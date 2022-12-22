<template>
  <div>
    <img :src="CasePng" alt=""  class="banner">


    <div class="cases">
      <div v-for="item,index in cases" class="cases-items">
        <img :src="item" alt="" class="cases-pic">
        <div class="cases-text">{{ casestext[index] }}</div>
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
import CasePng from '@/assets/case.png'
import {ref,onMounted} from 'vue'
const cases = ref()
const casestext = [
  "花都政府综合管理平台",
  "鸿合大厦智能化工程",
  "禾正医院",
  "广发金融中心",
  "珠海长隆海洋王国/大马戏",
  "巴基斯坦伊斯兰堡新国际机场",
  "广州地铁运营指挥中心",
  "中国南方电网",
  "南海保利水城",
  "国家数字电子产品质量监督检验中心",
  "惠州会展中心",
  "番禺莲花山粤海酒店",
  "北京铁路电气化学校",
  "深圳绿景纪元大厦",
  "正中高尔夫酒店",
  "广交会威斯汀酒店",
  "国际羽毛球培训中心",
  "张家港购物公园"
]
onMounted(() => {
  let casespng = import.meta.glob("@/assets/case/*.jpg", { 'eager': true })
  
  cases.value = Object.keys(casespng)


  console.log('casespng', cases.value);
  
})

</script>

<style scoped lang="less">
.banner{
  width: 100%;
  height: 300px;
}
.cases{
  width: 80%;
  margin: 0 10%;
  display: flex;
  align-items: center;
  justify-content: space-evenly;
  flex-wrap: wrap;
  .cases-items{
    width: 30%;
    height: 300px;
    margin: 20px;
    position: relative;

    .cases-pic {
      width: 100%;
      height: 80%;
    }

    .cases-text {
      font-size: 18px;
      left: 25%;
      position: absolute;
      top: 30%;
      color: aliceblue;
      font-weight: 900;
    }
  }
}
</style>