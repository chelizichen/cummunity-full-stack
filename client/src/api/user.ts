import request from "../utils/request";

export function list() {
  return request({
    url: "user/list",
    method:"get"
  });
}
