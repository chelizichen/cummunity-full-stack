<template>
  <div class="bg">
  <UserComponent></UserComponent>
  <SerVantComponent :servant="state.servant"></SerVantComponent>
  <CarPortComponent :port="state.port"></CarPortComponent>
  </div>
  
</template>

<script setup lang="ts">


// 得到个人信息
// 得到业主个人信息
// 得到代办理的事物
// 提供服务接口
// 得到提交服务的列表
import { onMounted, reactive } from 'vue';
import { getOne as getOneByUserId, owner_servant_list } from '../../api/owner';
import { getCarPortListByCommunityId } from '../../api/port';
import useUserInfoStore from '../../store/userInfo'
import UserComponent from '@/components/owner/user.vue'
import SerVantComponent from '@/components/owner/servant.vue'
import CarPortComponent from '@/components/owner/carport.vue'



const state = reactive({
  servant: null,
  port:null,
})

const infoStore = useUserInfoStore()

async function init() {
  console.log('2', infoStore.owner_info);
  
  let community_id = infoStore.owner_info?.communityId as string;
  const port_list = await getCarPortListByCommunityId({
    community_id,
  })
  state.port = port_list.data
  
  let userId = infoStore.user_info?.id as string;
  const servant_list = await owner_servant_list({id:userId})  
  state.servant = servant_list.data
}

onMounted(() => {
  init()
})

</script>


<style scoped lang="less">
.bg{
  background-color: rgb(232, 242, 239);
}
</style>
