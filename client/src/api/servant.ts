import { Pagination, QueryId } from "../type/common";
import { servant__table } from "../type/servant";
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

export function update(data: servant__table) {
  return request({
    url: "servant/update",
    method: "post",
    data
  })
}