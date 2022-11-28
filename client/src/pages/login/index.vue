<template>
<el-tabs v-model="activeName" class="demo-tabs" @tab-click="handleClick">
  <el-tab-pane label="User" name="first">
    <User @set-disable="setDisable" ></User>
  </el-tab-pane>
  <el-tab-pane label="Owner" name="second" :disabled="disabled">
     <Owner></Owner>
  </el-tab-pane>
</el-tabs>
</template>

<script setup lang="ts">
import { ref, reactive } from 'vue'
import type { TabsPaneContext } from 'element-plus'
import User from './user.vue'
import Owner from './owner.vue'
const activeName = ref('first')

const disabled = ref(true)

function setDisable() {
  disabled.value = false
  activeName.value = "second"
}

const handleClick = (tab: TabsPaneContext, event: Event) => {
  console.log(tab, event)
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
