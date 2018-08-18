package com.xxnc.dao;

import com.xxnc.pojo.Appraise;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 映射器接口    评价
 */
@Repository
public interface AppraiseMapper {
    //查询所有
    @Select("select a.pid,a.pappraise,b.yusername,c.sname,c.simg from appraise a,user b,commodity c where a.yid=b.yid and a.sid=c.sid ")
    List<Appraise> find();

    //增加
    @Insert("insert into appraise(sid,yid,pappraise) values(#{sid},#{yid},#{pappraise})")
    int add(Appraise appraise);

    //删除
    @Delete("delete from appraise where pid=#{pid}")
    int remove(Integer pid);
}
