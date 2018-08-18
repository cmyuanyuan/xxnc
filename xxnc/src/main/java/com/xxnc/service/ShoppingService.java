package com.xxnc.service;

import com.xxnc.dao.ShoppingMapper;
import com.xxnc.pojo.Shopping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingService {
    @Autowired
    private ShoppingMapper shoppingMapper;
    public List<Shopping> find(){
        return shoppingMapper.find();
    }
    public Shopping find(Integer gid){
        return shoppingMapper.findbyid(gid);
    }
    public int add(Shopping shopping){
        return shoppingMapper.add(shopping);
    }
    public int modify(Shopping shopping){
        return shoppingMapper.modify(shopping);
    }
    public int remove(Integer gid){
        return shoppingMapper.remove(gid);
    }

}
