export type menu = {
  id: string;
  meName: string;
  mePermission: string;
  meIsRoot: string;
  meRootId: string;
  mePath: string;
  createTime: Date;
}

export type add_menu = Omit<menu,"createTime"|"id">
export type update_menu = Omit<menu, "createTime">;