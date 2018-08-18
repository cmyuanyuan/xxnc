package com.xxnc.service;

import com.xxnc.dao.AppraiseMapper;
import com.xxnc.pojo.Appraise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class AppraiseService {
    @Autowired
    private AppraiseMapper appraiseMapper;

    public List<Appraise> find(){
        return appraiseMapper.find();
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    public  int add(Appraise appraise){
        return appraiseMapper.add(appraise);
    }
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int remove(Integer pid){return appraiseMapper.remove(pid);}
}
