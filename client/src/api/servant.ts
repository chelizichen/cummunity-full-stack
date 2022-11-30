import { Pagination } from "../type/common";
import request from "../utils/request";

export function list(params:Pagination) {
  return request({
    url:"servant/list",
    params
  })
}

export function del(params: Pagination) {
  return request({
    url: "servant/del",
    params,
  });
}

export function update(data: any) {
  return request({
    url: "servant/update",
    method: "post",
    data
  })
}