package com.example.project.mapper;

import com.example.project.pojo.CarPort;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface CarPortMapper {
    List<CarPort> getCarPortList(@Param("keyword")String keyword,@Param("page")Number page,@Param("size")String size);
    List<CarPort> getPortListByCommunityId(@Param("portCommunityId")String portCommunityId);
    Integer updateBespeak(CarPort carPort);
    Integer updateOpen(CarPort carPort);
    Integer insertCarPort(CarPort carPort);
    Integer updateCarPort(CarPort carPort);
    Integer delOneById(@Param("id")String id);
    Integer dealBespeak(CarPort carPort);
    List<CarPort> listBespeak(@Param("portCommunityId")String portCommunityId,@Param("portIsBespeak")String portIsBespeak);

}
