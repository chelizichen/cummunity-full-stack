<template>
  <div>Owner 个人用户页面</div>
</template>

<script setup lang="ts">


// 得到个人信息
// 得到业主个人信息
// 得到代办理的事物
// 提供服务接口
// 得到提交服务的列表
import { onMounted } from 'vue';
import { getOne } from '../../api/user';
import { getOne as getOneByUserId } from '../../api/owner';
import { getCarPortListByCommunityId } from '../../api/port';

async function init() {
  const user_data = await  getOne({id:"1"})
  const owner_data = await getOneByUserId({ id: "1" })
  console.log(user_data);
  console.log(owner_data);
  const port_list = await getCarPortListByCommunityId({
    community_id: owner_data.data.communityId
  })
  console.log(port_list);
  
}

onMounted(() => {
  init()
})

</script>


<style scoped lang="less">

</style>
