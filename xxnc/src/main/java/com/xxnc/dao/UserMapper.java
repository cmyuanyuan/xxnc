package com.xxnc.dao;

import com.xxnc.pojo.User;
import com.xxnc.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *  映射器接口
 *
 * @author JH
 */
@Repository
public interface UserMapper {

    @Select("select yid,yname,ypassword,yusername,phone,yemail,yroot from user where yname=#{yname}")
    List<User> findByName(
            @Param("yname") String yname
    );


    User findByParam(
            @Param("yname") String yname,
            @Param("ypassword") String ypassword
    );

    @Insert("insert into user(yname,ypassword,yusername,phone,yemail) values(#{yname},#{ypassword},#{yusername},#{phone},#{yemail})")
    int add(User user);

    @Update("update user set yusername=#{yusername},ypassword=#{ypassword},phone=#{phone},yemail=#{yemail} where yid=#{yid}")
    int modify(User user);

    @Delete("delete from user where yid=#{yid}")
    int remove(Integer yid);

}
