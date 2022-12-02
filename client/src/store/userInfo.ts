import { defineStore } from "pinia";
import { owner__table } from "../type/owner";
import { user } from "../type/user";

type _state_ = Partial<{
  userId: string,
  owner_info: owner__table,
  user_info:user
}>

let useUserInfoStore = defineStore("useUserStore", {
  state: ():_state_ => ({
    userId: undefined,
    user_info: undefined,
    owner_info:undefined
  }),
  actions: {
    getUserId() {
      if (!this.userId) {
        let userId = localStorage.getItem("userId");
        if (!userId) {
          return false;
        } else {
          return userId;
        }
      } else {
        return this.userId;
      }
    },

    async setUserInfo(obj: any) {
      this.user_info = obj;
    },
    async setOwnerInfo(obj: any) {
      this.owner_info = obj;
    }
  },
});

export default useUserInfoStore;
