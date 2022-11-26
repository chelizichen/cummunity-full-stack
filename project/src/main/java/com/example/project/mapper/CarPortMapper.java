package com.example.project.mapper;

import com.example.project.pojo.CarPort;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarPortMapper {
    List<CarPort> getCarPortList(@Param("keyword")String keyword,@Param("page")String page,@Param("size")String size);
    List<CarPort> getPortListByCommunityId(@Param("portCommunityId")String portCommunityId);
    Integer updateBespeak(CarPort carPort);
    Integer updateOpen(CarPort carPort);
    Integer insertCarPort(CarPort carPort);
}
