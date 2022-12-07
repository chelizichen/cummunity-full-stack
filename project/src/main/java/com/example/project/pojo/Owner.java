package com.example.project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 业主
 * 所属小区
 * 所属单元
 * 所属权限等级
 * 所属门牌号
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Owner {
    String id; // Key
    String communityId; // 社区
    String cell; // 单元楼
    String doorId; // 门牌号
    String userId; // 账户ID
    String carId; // 车牌号
    String homeSquare; // 房间大小
    String createTime; //

    User user;
}
