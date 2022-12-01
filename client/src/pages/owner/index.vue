<template>
  <div class="bg">
  <UserComponent :user="state.user" :owner="state.owner"></UserComponent>
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
import { getOne } from '../../api/user';
import { getOne as getOneByUserId, owner_servant_list } from '../../api/owner';
import { getCarPortListByCommunityId } from '../../api/port';
import useUserInfoStore from '../../store/module/userInfo';
import UserComponent from '@/components/owner/user.vue'
import SerVantComponent from '@/components/owner/servant.vue'
import CarPortComponent from '@/components/owner/carport.vue'



const state = reactive({
  user: null,
  owner: null,
  servant: null,
  port:null,
})

const infoStore = useUserInfoStore()

async function init() {
  let userId = infoStore.getUserId() as string;
  // const userId = localStorage.getItem("")
  const user_data = await  getOne({id:userId})
  const owner_data = await getOneByUserId({ id: userId })
  const port_list = await getCarPortListByCommunityId({
    community_id: owner_data.data.communityId
  })
  const servant_list = await owner_servant_list({id:userId})
  console.log(port_list.data);
  console.log(servant_list);
  

  state.user = user_data.data
  state.owner = owner_data.data
  state.servant = servant_list.data
  state.port = port_list.data
  
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
