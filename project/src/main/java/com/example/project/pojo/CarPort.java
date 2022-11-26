package com.example.project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarPort {
    String id; // ID key
    String portPermission; // 停车位所需要的权限
    String portArea; // 车位所属区域
    String portSum; // 车位总数量
    String portManagerId; // 车库管理员ID
    String portId; // 停车点位ID
    String portCommunityId; // 小区ID
    String portIsOpen; // 0 ，1
    String portIsBespeak; // 是否被预约了
    String portCarId; // 停车车牌号
    String portUserId; // 停车人ID
    String createTime;

}
