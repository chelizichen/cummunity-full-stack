import { update_user } from "../type/user";
import request from "../utils/request";

export function list(params:Pagination) {
  return request({
    url: "user/list",
    method: "get",
    params
  });
}

export function del(params:QueryId) {
  return request({
    url: "user/del",
    method: "get",
    params
  });
}

export function getOne(params:QueryId) {
  return request({
    url: "user/one",
    method: "get",
    params
  });
}

export function update(data: update_user) {
  return request({
    url: "user/update",
    method: "post",
    data
  });
}

