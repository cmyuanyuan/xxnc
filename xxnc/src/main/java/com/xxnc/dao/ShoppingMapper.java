package com.xxnc.dao;

import com.xxnc.pojo.Shopping;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingMapper {
    @Select("select * from shopping")
    List<Shopping> find();
    @Select("select * from shopping where gid=#{gid}")
    Shopping findbyid(Integer gid);
    @Insert("insert into shopping(gnumber,sid, yid) values(#{gnumber},#{sid},#{yid})")
    int add(Shopping shopping);
    @Update("update shopping set gnumber=#{gnumber},sid=#{sid},yid=#{yid} where gid=#{gid}")
    int modify(Shopping shopping);
    @Delete("delete from shopping where gid=#{gid}")
    int remove(Integer gid);
}
