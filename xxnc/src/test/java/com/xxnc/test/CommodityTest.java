package com.xxnc.test;

import com.xxnc.pojo.Commodity;
import com.xxnc.service.CommodityService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CommodityTest {
    private CommodityService commodityService;
    @Before
    public void init(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        commodityService=applicationContext.getBean("commodityService",CommodityService.class);
    }
    @Test
    public void s(){
        List<Commodity> list=commodityService.find();
        for (Commodity o:list){
            System.out.println(o);
        }
    }
}
