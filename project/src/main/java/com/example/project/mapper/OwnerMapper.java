package com.example.project.mapper;

import com.example.project.pojo.Owner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OwnerMapper {
    List<Owner> getOwnerList(@Param("keyword")String keyword, @Param("page")Integer page, @Param("size")String size);
    Integer updateOwner(Owner owner);
    Integer addOwner(Owner owner);
    Owner getOne(@Param("id") String id);
    Owner getOneByUserId(@Param("userId")String id);
    Integer del(@Param("id") String id);
    Owner getInfoByUserId(@Param("id")String id);
}
