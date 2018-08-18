package com.xxnc.service;


import com.xxnc.dao.CommodityMapper;
import com.xxnc.pojo.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityService {
    @Autowired
    private CommodityMapper commodityMapper;

    public List<Commodity> find(){
        return commodityMapper.find();
    }

    public Commodity find(Integer sid){
        return commodityMapper.findbyid(sid);
    }
}
