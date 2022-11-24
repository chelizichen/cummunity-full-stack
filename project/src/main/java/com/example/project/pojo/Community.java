package com.example.project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Community {
    String Id;
    String Name; // 社区名字
    String Location; // 地址
    String createTime;
}
