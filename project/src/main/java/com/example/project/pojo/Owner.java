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
    String Permission; // 权限
    String Community; // 社区
    String Cell; // 单元楼
    String DoorId; // 门牌号
    String UserId; // 账户ID
    String CarId; // 车牌号
    String HomeSquare; // 房间大小
    String createTime; //
}
