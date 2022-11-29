<template>
  <el-dialog v-model="props.dialogFormVisible" title="Shipping address" @closed="close">
    <el-form :model="props.val">

      <el-form-item label="所属区域" :label-width="formLabelWidth">
        <el-input v-model="props.val.portArea" autocomplete="off" />
      </el-form-item>
      <el-form-item label="所属用户ID" :label-width="formLabelWidth">
        <el-input v-model="props.val.portUserId" autocomplete="off" />
      </el-form-item>
      <el-form-item label="所属车牌号" :label-width="formLabelWidth">
        <el-input v-model="props.val.portCarId" autocomplete="off" />
      </el-form-item>

      <el-form-item label="所属社区ID" :label-width="formLabelWidth">
        <el-input v-model="props.val.portCommunityId" autocomplete="off" />
      </el-form-item>
      <el-form-item label="所属停车位ID" :label-width="formLabelWidth">
        <el-input v-model="props.val.portId" autocomplete="off" />
      </el-form-item>
      <el-form-item label="是否被预约" :label-width="formLabelWidth">
        <el-input v-model="props.val.portIsBespeak" autocomplete="off" />
      </el-form-item>
      <el-form-item label="是否开放" :label-width="formLabelWidth">
        <el-input v-model="props.val.portIsOpen" autocomplete="off" />
      </el-form-item>
      <el-form-item label="管理者ID" :label-width="formLabelWidth">
        <el-input v-model="props.val.portManagerId" autocomplete="off" />
      </el-form-item>
      <el-form-item label="所属权限" :label-width="formLabelWidth">
        <el-input v-model="props.val.portPermission" autocomplete="off" />
      </el-form-item>
      <el-form-item label="所属停车位总量" :label-width="formLabelWidth">
        <el-input v-model="props.val.portSum" autocomplete="off" />
      </el-form-item>

    </el-form>
    <template #footer>
      <span class="dialog-footer">
        <el-button @click="close">取消</el-button>
        <el-button type="primary" @click="submit">
          修改
        </el-button>
      </span>
    </template>
  </el-dialog>
</template>

<script setup lang="ts">
import { reactive, ref, watch } from 'vue'
import { update } from '../../api/port';
import { car_port__table } from '../../type/car_port';

const props = defineProps<{
  dialogFormVisible: boolean,
  val: car_port__table
}>()


const formLabelWidth = '140px'

async function submit() {
  const data = await update(props.val)
  // @ts-ignore
  if (data.code == 0) {
    emit("success", "操作成功")
    emit("close")
  }
  console.log(data);

}

const emit = defineEmits(["close", "success"])

function close() {
  emit("close")
}


</script>

<style scoped>

</style>