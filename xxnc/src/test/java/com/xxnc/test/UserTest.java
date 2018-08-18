package com.xxnc.test;

import com.xxnc.pojo.User;
import com.xxnc.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserTest {
    private UserService userService;

    @Before
    public void init(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        userService = ctx.getBean("userService",UserService.class);
    }

    @Test
    public void findParam(){
        User user = userService.find("admin","admin");
        if (user==null){
            System.out.println(1);
        }else {
            System.out.println(2);
        }
    }

    @Test
    public void add(){
        User user = new User();
        user.setYname("oop123");
        user.setYusername("段誉");
        user.setYpassword("jdbc12345");
        user.setPhone("134244321");
        user.setYemail("1ca23@qq.com");

        int count = userService.add(user);
        if(count>0){
            System.out.println("注册成功");
        }else {
            System.out.println("注册失败");
        }
    }

    @Test
    public void update(){
        User user = new User();
        user.setYid(4);

        user.setYpassword("64342");
        user.setYusername("吕帅逼");
        user.setYemail("faf@qq.com");
        user.setPhone("13445632");


        int count = userService.modify(user);
        if(count>0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
    }

    @Test
    public  void remove(){
        userService.remove(4);
        System.out.println("用户已注销");

    }
}
