<template>
  <el-dialog v-model="props.dialogFormVisible" title="Shipping address" @closed="close">
    <el-form :model="props.val">

      <el-form-item label="所属小区ID" :label-width="formLabelWidth">
        <el-input v-model="props.val.communityId" autocomplete="off" />
      </el-form-item>
      <el-form-item label="所属用户ID" :label-width="formLabelWidth">
        <el-input v-model="props.val.userId" autocomplete="off" />
      </el-form-item>
      <el-form-item label="车牌号" :label-width="formLabelWidth">
        <el-input v-model="props.val.carId" autocomplete="off" />
      </el-form-item>

      <el-form-item label="所属单元楼" :label-width="formLabelWidth">
        <el-input v-model="props.val.cell" autocomplete="off" />
      </el-form-item>
      <el-form-item label="所属门牌号" :label-width="formLabelWidth">
        <el-input v-model="props.val.doorId" autocomplete="off" />
      </el-form-item>
      <el-form-item label="所属房屋面积" :label-width="formLabelWidth">
        <el-input v-model="props.val.homeSquare" autocomplete="off" />
      </el-form-item>
      <el-form-item label="所属用户权限" :label-width="formLabelWidth">
        <el-input v-model="props.val.permission" autocomplete="off" />
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
import { update } from '../../api/owner';
import { owner__table } from '../../type/owner';

const props = defineProps<{
  dialogFormVisible: boolean,
  val: owner__table
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