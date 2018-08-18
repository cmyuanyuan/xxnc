package com.xxnc.dao;

import com.xxnc.pojo.Commodity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommodityMapper {
    @Select("select * from commodity")
    List<Commodity> find();

    @Select("select * from commodity where sid=#{sid}")
    Commodity findbyid(Integer sid);
}
