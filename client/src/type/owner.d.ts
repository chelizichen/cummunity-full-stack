export type owner__table = {
  id: string;
  ownPermission: string;
  ownCommunity_id: SVGStringList;
  ownCell: string;
  ownDoorId: string;
  ownUserId: string;
  ownCarId: string;
  ownHomeSquare: string;
  createTime: Date;
}


export type add_owner = Omit<owner__table, "createTime"|"id">
export type update_owner = Omit<owner__table,"createTime">