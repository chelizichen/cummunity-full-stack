package com.example.project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Servant {
    String id; // Key
    String permission; // 权限 2，3，4，5
    String communityId; // 服务 所在 社区
    String address; // 服务 所在 地址
    String userId; // 账户ID
    String desc; // 服务描述
    String servantType; // 服务类型
    String status; // 服务是否已完成 1 2 -1
    String weight; // 服务权重
    String createTime; // 服务是否已完成
}
