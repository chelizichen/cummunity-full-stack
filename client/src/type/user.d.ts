export type user = {
  id: string;
  username: string;
  password: string;
  email: string;
  phone: string;
  permission: string;
  createTime: Date;
}


export type update_user = Omit<user,"createTime">
export type add_user = Omit<user, "createTime"|"id">;