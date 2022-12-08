import { Pagination, QueryId } from "../type/common";
import { add_community, update_community } from "../type/community";
import request from "../utils/request";

export function list(params: Pagination) {
  return request({
    url:"community/list",
    params
  })
}
export function del(params: QueryId) {
  return request({
    url: "community/del",
    params,
  });
}
export function update(data: update_community | add_community ) {
  return request({
    url: "community/update",
    method:"post",
    data,
  });
}
export function one(params: QueryId) {
  return request({
    url: "menu/one",
    params,
  });
}
