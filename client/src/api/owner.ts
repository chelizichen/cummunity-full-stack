import { Pagination, QueryId } from "../type/common";
import { add_owner, owner__table, update_owner } from "../type/owner";
import request from "../utils/request";

export function list(params:Pagination) {
  return request({
    url: "owner/list",
    method: "get",
    params
  })
}

export function del(params: QueryId) {
  return request({
    url: "owner/del",
    method: "get",
    params,
  });
}

export function update(data: update_owner | add_owner) {
  return request({
    url: "owner/update",
    method: "post",
    data,
  });
}

