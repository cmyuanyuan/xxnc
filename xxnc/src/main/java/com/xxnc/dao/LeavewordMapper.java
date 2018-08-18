package com.xxnc.dao;


import com.xxnc.pojo.Leaveword;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeavewordMapper {
    //查询所有
    @Select("select a.lid,a.ldate,a.lleaveword,b.yusername from leaveword a,user b where a.yid=b.yid  ")
    List<Leaveword> find();

    //增加
    @Insert("insert into leaveword(yid,ldate,lleaveword) values(#{yid},#{ldate},#{lleaveword})")
    int add(Leaveword leaveword);


    //删除
    @Delete("delete from leaveword where lid=#{lid}")
    int remove(Integer lid);
}
