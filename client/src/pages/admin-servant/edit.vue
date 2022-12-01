<template>
  <el-dialog v-model="props.dialogFormVisible" title="Shipping address" @closed="close">
    <el-form :model="props.val">

      <el-form-item label="所属社区ID" :label-width="formLabelWidth">
        <el-input v-model="props.val.communityId" autocomplete="off" />
      </el-form-item>
      <el-form-item label="用户ID" :label-width="formLabelWidth">
        <el-input v-model="props.val.userId" autocomplete="off" />
      </el-form-item>
      <el-form-item label="所属地址" :label-width="formLabelWidth">
        <el-input v-model="props.val.address" autocomplete="off" />
      </el-form-item>
      <el-form-item label="服务描述" :label-width="formLabelWidth">
        <el-input v-model="props.val.desc" autocomplete="off" />
      </el-form-item>
      <el-form-item label="服务权限" :label-width="formLabelWidth">
        <el-input v-model="props.val.permission" autocomplete="off" />
      </el-form-item>
      <el-form-item label="服务类型" :label-width="formLabelWidth">
        <el-input v-model="props.val.servantType" autocomplete="off" />
      </el-form-item>
      <el-form-item label="服务状态" :label-width="formLabelWidth">
        <el-input v-model="props.val.status" autocomplete="off" />
      </el-form-item>
      <el-form-item label="服务权重" :label-width="formLabelWidth">
        <el-input v-model="props.val.weight" autocomplete="off" />
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
import { update } from '../../api/servant';
import { servant__table } from '../../type/servant';

const props = defineProps<{
  dialogFormVisible: boolean,
  val: servant__table
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