export type menu__table = {
  id: string;
  menuName: string;
  menuPermission: string;
  menuIsRoot: string;
  menuRootId: string;
  menuPath: string;
  createTime: Date;
};

export type add_menu = Omit<menu,"createTime"|"id">
export type update_menu = Omit<menu, "createTime">;