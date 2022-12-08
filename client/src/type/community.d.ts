export type community__table = {
  id: string;
  name: string;
  location: string;
  createTime: Date;
}

export type add_community = Omit<community__table, "id" | "createTime">

export type update_community = Omit<community__table, "createTime">;

