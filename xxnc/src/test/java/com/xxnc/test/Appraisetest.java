package com.xxnc.test;

import com.xxnc.pojo.Appraise;
import com.xxnc.pojo.Orderform;
import com.xxnc.service.AppraiseService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Appraisetest {
    private AppraiseService appraiseService;

    @Before
    public void init(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        appraiseService=ctx.getBean("appraiseService",AppraiseService.class);
    }

    @Test
    public void add(){
        Appraise appraise=new Appraise();
        appraise.setYid(2);
        appraise.setSid(2);
       appraise.setPappraise("好吃");
        int a=appraiseService.add(appraise);
        if (a>0){
            System.out.println("OK");
        }else {
            System.out.println("NO");
        }
    }

    @Test
    public void remove(){
        int a=appraiseService.remove(2);

    }
}
