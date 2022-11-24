package com.example.project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarPort {
    String id; // ID key
    String PortPermission; // 停车位所需要的权限
    String PortArea; // 车位所属区域
    String PortSum; // 车位总数量
    String PortManagerId; // 车库管理员ID
    String PortId; // 停车点位ID
    String PortCommunityId; // 小区ID
    String PortIsOpen; // 0 ，1
    String PortIsBespeak; // 是否被预约了
    String PortCarId; // 停车车牌号
    String PortUserId; // 停车人ID
    String createTime;

}
