package com.example.project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    String id;
    String menuName;
    String menuPermission;
    String menuIsRoot;
    String menuRootId;
    String menuPath;
    String createTime;
}
