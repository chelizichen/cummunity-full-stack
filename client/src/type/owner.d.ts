export type owner__table = {
  id: string;
  communityId: string;
  cell: string;
  doorId: string;
  userId: string;
  carId: string;
  homeSquare: string;
  createTime: Date;
};


export type add_owner = Omit<owner__table, "createTime"|"id">
export type update_owner = Omit<owner__table,"createTime">