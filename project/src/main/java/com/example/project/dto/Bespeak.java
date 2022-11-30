package com.example.project.dto;

import com.example.project.pojo.Owner;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 业主功能
 * 预约车位的结构化数据
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bespeak {
    String userId;
    String id;
    String carId;
    String bespeak_status;
}
