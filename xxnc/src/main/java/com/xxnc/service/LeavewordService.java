package com.xxnc.service;

import com.xxnc.dao.LeavewordMapper;
import com.xxnc.pojo.Appraise;
import com.xxnc.pojo.Leaveword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class LeavewordService {
    @Autowired
    private LeavewordMapper leavewordMapper;
    public List<Leaveword> find(){
        return leavewordMapper.find();
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    public  int add(Leaveword leaveword){
        return leavewordMapper.add(leaveword);
    }


    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int remove(Integer lid){return leavewordMapper.remove(lid);}
}
