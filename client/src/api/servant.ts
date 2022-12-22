import { Pagination, QueryId } from "../type/common";
import { add_servant, servant__table, update_servant } from "../type/servant";
import request from "../utils/request";

export function list(params:Pagination) {
  return request({
    url:"servant/list",
    params
  })
}

export function del(params: QueryId) {
  return request({
    url: "servant/del",
    params,
  });
}

export function update(data: update_servant | add_servant) {
  return request({
    url: "servant/update",
    method: "post",
    data
  })
}