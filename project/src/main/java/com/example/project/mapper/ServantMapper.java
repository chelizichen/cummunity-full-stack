package com.example.project.mapper;

import com.example.project.pojo.Servant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ServantMapper {
    List<Servant> getServantList(@Param("keyword")String keyword,@Param("page")String page,@Param("size")String size);
    List<Servant> getOwnServant(@Param("userId")String userId);
    Integer updateServant(Servant servant);
    Integer addServant(Servant servant);
    Integer delServant(@Param("id")String id);
}
