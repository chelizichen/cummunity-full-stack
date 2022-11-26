export type servant__table = {
  id: string;
  permission: string;
  address: string;
  desc: string;
  servantType: string;
  status: string;
  weight: string;
  community_id: string;
  createTime: Date;
}

export type add_servant = Omit<servant__table,"id"|"createTime">
export type update_servant = Omit<servant__table, "createTime">;