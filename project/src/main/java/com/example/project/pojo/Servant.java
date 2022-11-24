package com.example.project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Servant {
    String id; // Key
    String Permission; // 权限 2，3，4，5
    String Community; // 服务 所在 社区
    String Address; // 服务 所在 地址
    String UserId; // 账户ID
    String Desc; // 服务描述
}
