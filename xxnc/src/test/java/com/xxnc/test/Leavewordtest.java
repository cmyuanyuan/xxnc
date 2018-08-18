package com.xxnc.test;

import com.xxnc.pojo.Leaveword;
import com.xxnc.service.LeavewordService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Leavewordtest {
    private LeavewordService leavewordService;

    @Before
    public  void init(){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        leavewordService=ctx.getBean("leavewordService",LeavewordService.class);
    }

    @Test
    public void find(){
        for (Leaveword a:leavewordService.find()){
            System.out.println(a.getLid()+""+a.getYusername()+""+a.getLdate()+""+a.getLleaveword());
        }

    }

    @Test
    public void remove(){
        leavewordService.remove(3);
        System.out.println("OK");
    }
}
