package com.xxnc.dao;


import com.xxnc.pojo.Orderform;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 映射器接口
 */
@Repository
public interface OrderformMepper {
        //查询所有
        @Select("select a.did,a.ddate,a.dnumber,a.dprice,a.dstatus,b.yusername,c.sname,c.simg,c.sprice from orderform a,user b,commodity c where a.yid=b.yid and a.sid=c.sid ")
        List<Orderform> find();


        //根据id查询
        @Select("select a.did,a.ddate,a.dnumber,a.dprice,a.dstatus,b.yusername,c.sname,c.simg,c.sprice from orderform a,user b,commodity c where  a.yid=b.yid AND a.sid=c.sid AND a.did=#{a.did}")
        Orderform findById(Integer did);

        //增加
        @Insert("insert into orderform(yid,sid,ddate,dnumber,dprice) values(#{yid},#{sid},#{ddate},#{dnumber},#{dprice})")
        int add(Orderform orderform);


        //修改
        @Update("update orderform set  yid=#{yid},sid=#{sid},ddate=#{ddate},dnumber=#{dnumber},dprice=#{dprice},dstatus=#{dstatus} where did=#{did}")
        int modify(Orderform orderform);

}
