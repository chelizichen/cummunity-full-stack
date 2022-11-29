import { add_car_port, update_car_port } from "../type/car_port";
import { Pagination, QueryId } from "../type/common";
import request from "../utils/request";

export function list(params: Pagination) {
  return request({
    url: "carport/list",
    method: "get",
    params,
  });
}


export function del(params: QueryId) {
  return request({
    url: "carport/del",
    method: "get",
    params,
  });
}

export function update(data: add_car_port | update_car_port) {
  return request({
    url: "carport/update",
    method: "post",
    data,
  });
}

export function getCarPortListByCommunityId(params: { community_id :string}) {
  return request({
    url: "servant/port_list_by_community_id",
    method: "get",
    params,
  });
}