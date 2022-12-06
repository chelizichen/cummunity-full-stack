<template>
  <div>
    车位状态
      <PortPie :port="state.port"></PortPie>
  </div>
</template>

<script setup lang="ts">

import { reactive,onMounted } from 'vue';
import { getCarPortListByCommunityId } from '../../api/port';
import useUserInfoStore from '../../store/userInfo';
import PortPie from '../../charts/PortPie.vue';

const infoStore = useUserInfoStore()

const state = reactive({
  port:[]
})
async function init() {
  let community_id = infoStore.owner_info?.communityId as string;
  const port_list = await getCarPortListByCommunityId({
    community_id,
  })
  state.port = port_list.data
}

onMounted(async () => {
  init()
})

</script>

<style scoped>

</style>