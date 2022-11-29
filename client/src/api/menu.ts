import { QueryId } from "../type/common";
import { add_menu, update_menu } from "../type/menu";
import request from "../utils/request";

export function list(params: { permission: string }) {
  return request({
    url: "menu/list",
    params
  })
}

export function del(params: QueryId) {
  return request({
    url: "menu/del",
    params
  })
}

export function update(data: update_menu | add_menu) {
  return request({
    url: "menu/update",
    method: "post",
    data
  })
}