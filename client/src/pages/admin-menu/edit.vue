<template>
  <el-dialog v-model="props.dialogFormVisible" title="Shipping address" @closed="close">
    <el-form :model="props.val">

      <el-form-item label="是否为父菜单" :label-width="formLabelWidth">
        <el-input v-model="props.val.menuIsRoot" autocomplete="off" />
      </el-form-item>
      <el-form-item label="菜单名" :label-width="formLabelWidth">
        <el-input v-model="props.val.menuName" autocomplete="off" />
      </el-form-item>
      <el-form-item label="菜单路径" :label-width="formLabelWidth">
        <el-input v-model="props.val.menuPath" autocomplete="off" />
      </el-form-item>
      <el-form-item label="菜单所需要的权限" :label-width="formLabelWidth">
        <el-input v-model="props.val.menuPermission" autocomplete="off" />
      </el-form-item>
      <el-form-item label="菜单组件路径" :label-width="formLabelWidth">
        <el-input v-model="props.val.menuComponent" autocomplete="off" />
      </el-form-item>
      <el-form-item label="父菜单ID" :label-width="formLabelWidth">
        <el-input v-model="props.val.menuRootId" autocomplete="off" />
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
import { update } from '../../api/menu';
import { menu__table } from '../../type/menu';

const props = defineProps<{
  dialogFormVisible: boolean,
  val: menu__table
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