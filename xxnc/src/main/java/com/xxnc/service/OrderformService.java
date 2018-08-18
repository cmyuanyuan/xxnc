package com.xxnc.service;

import com.xxnc.dao.OrderformMepper;
import com.xxnc.pojo.Orderform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 业务逻辑实现类
 *
 */
@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class OrderformService {
    @Autowired
    private OrderformMepper orderformMepper;

    public List<Orderform> find(){
        return orderformMepper.find();
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Orderform findById(Integer did) {
        return orderformMepper.findById(did);
    }

    public  Orderform find(Integer   did){
        return orderformMepper.findById(did);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    public  int add(Orderform order){
        return orderformMepper.add(order);
    }
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int modify(Orderform order){
        return orderformMepper.modify(order);
    }

}
