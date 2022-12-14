export type car_port__table = {
  id: string;
  portPermission: string;
  portArea: string;
  portSum: string;
  portManagerId:string;
  portId: string;
  portCommunityId: string;
  portIsOpen: string;
  portIsBespeak: string;
  portCarId: string;
  portUserId: string;
  createTime: Date;
}

export type update_car_port = Omit<car_port__table, "createTime">

export type add_car_port = Omit<car_port__table, "id" | "createTime">

