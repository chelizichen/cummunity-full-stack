<template>
  <!-- 选项 -->
  <div>
    <el-button type="primary" size="small">添加</el-button>
  </div>
  <div>
    <Status/>
  </div>
  <!-- 表格 -->
  <div>
    <el-table :data="state.list" style="width: 100%">
      <el-table-column prop="id" label="ID" />
      <el-table-column prop="portId" label="停车位ID" />
      <el-table-column prop="portIsOpen" label="是否打开" >
        <template #default="scope">
          <div>{{ scope.row.portIsOpen ?"未打开":"已打开"}}</div>
        </template>
      </el-table-column>
      <el-table-column prop="portIsBespeak" label="是否被预约" >
              <template #default="scope">
                <div>{{ scope.row.portIsOpen ?"未预约":"已预约"}}</div>
              </template>
      </el-table-column>
      <el-table-column prop="portCarId" label="车牌号" />
      <el-table-column prop="portUserId" label="用户ID" />
      <el-table-column prop="createTime" label="创建时间" />
      <el-table-column label="操作">
        <template #default="scope">
          <el-popconfirm title="确认预约吗?" @confirm="handle_deal(scope.row)">
            <template #reference>
              <el-button type="primary" size="small">确认预约</el-button>
            </template>
          </el-popconfirm>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script setup lang="ts">

import { onMounted, reactive, ref } from 'vue';
import { list, del, getCarPortListByCommunityId, list_bespeak, dealBespeak } from '../../api/port';
import { Pagination } from '../../type/common.d'
import _ from 'lodash'
import { ElNotification } from 'element-plus';
import { car_port__table } from '../../type/car_port';
import useUserInfoStore from '../../store/userInfo';
import Status from './status.vue'
const state = reactive({
  list: <Array<car_port__table>>[]
})


const pagination = ref<Pagination>({
  size: 10,
  keyword: "",
  page: 1
})

async function handle_deal(item: car_port__table) {
  const data = await dealBespeak({
    portIsOpen:"0",
    id:item.id
  })
  // @ts-ignore
  if (data.code == 0) {
    //删除成功函数    
    init()
  }

}

async function init() {
  const community_id = useUserInfoStore().owner_info?.communityId as string;
  const data = await list_bespeak({ id: community_id });
  state.list = data.data;
}

onMounted(() => {
  init()
})

</script>

<style scoped>

</style>