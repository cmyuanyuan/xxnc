package com.xxnc.test;

import com.xxnc.pojo.Orderform;
import com.xxnc.service.OrderformService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Orderformtest {
    private OrderformService orderformService;
    @Before
    public void init(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        orderformService =ctx.getBean("orderformService", OrderformService.class);
    }

    @Test
    public void add(){
        Orderform orderform=new Orderform();
        orderform.setYid("1");
        orderform.setSid("2");
        orderform.setDdate(new Date());
        orderform.setDnumber(5);
        orderform.setDprice(500d);
//        orderform.setDstatus("没发货");
        int a=orderformService.add(orderform);
        if (a>0){
            System.out.println("OK");
        }else {
            System.out.println("NO");
        }
    }

    @Test
    public  void find(){
        for (Orderform o:orderformService.find()){
            System.out.println(o.getDid()+""+o.getYusername()+""+o.getSname()+""+o.getSimg()+""+o.getSprice()+""+o.getDdate()+""+o.getDnumber()+""+o.getDprice()+""+o.getDstatus());
        }
    }

    @Test
    public void findById(){
        Orderform o=orderformService.findById(3);
        System.out.println(o.getDid()+""+o.getYusername()+""+o.getSname()+""+o.getSimg()+""+o.getSprice()+""+o.getDdate()+""+o.getDnumber()+""+o.getDprice()+""+o.getDstatus());
    }
}
