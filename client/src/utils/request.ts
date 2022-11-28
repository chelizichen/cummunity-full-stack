import axios from "axios";

const request = axios.create({
  baseURL: "/server/",
  timeout: 50000,
  headers: { "Content-Type": "application/json;charset=utf-8" },
});


request.interceptors.response.use(function (response) {
  return response.data
}, function (err) {
  console.log(err);
})
export default request;
// request.
