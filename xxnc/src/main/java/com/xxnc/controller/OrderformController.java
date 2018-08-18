package com.xxnc.controller;

import com.xxnc.pojo.CustomErrorMessage;
import com.xxnc.pojo.Orderform;
import com.xxnc.service.OrderformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 控制器类
 */
@CrossOrigin(origins = "http://127.0.0.1:8080",maxAge = 3600)
@RestController
@RequestMapping("api/")
public class OrderformController{
    @Autowired
    private OrderformService orderformService;
    @RequestMapping(value = "orde",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Orderform>> list(){
        List<Orderform> cars=orderformService.find();
        if (cars.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(cars,HttpStatus.OK);
    }

    //id查询
    @RequestMapping(value = "orde/{did}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> findById(@PathVariable("did")Integer did){
        Orderform orderform=orderformService.find(did);
        if (orderform==null){
            return new ResponseEntity<>(new CustomErrorMessage("无此id："+did),HttpStatus.OK);
        }
        return new ResponseEntity<>(orderform,HttpStatus.OK);
    }

    //新增
    @RequestMapping(value = "orde",method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody Orderform orderform){
        int count=orderformService.add(orderform);
        return new ResponseEntity<>(count,HttpStatus.OK);
    }

    //修改
    @RequestMapping(value = "orde",method = RequestMethod.PUT)
    public ResponseEntity<?> update(@RequestBody Orderform orderform){
        int count=orderformService.modify(orderform);
        return new ResponseEntity<>(count,HttpStatus.OK);
    }
}
