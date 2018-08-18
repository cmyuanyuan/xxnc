package com.xxnc.controller;

import com.xxnc.pojo.Appraise;
import com.xxnc.service.AppraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Repository
@RequestMapping("api/")
@CrossOrigin(origins = "http://127.0.0.1:8080",maxAge = 3600)
public class AppraiseController {

    @Autowired
    private AppraiseService appraiseService;

    //查询所有
    @RequestMapping(value = "appraise",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Appraise>> list(){
        List<Appraise> cars=appraiseService.find();
        if (cars.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(cars,HttpStatus.OK);
    }

    //新增
    @RequestMapping(value = "appraise",method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody Appraise appraise){
        int count=appraiseService.add(appraise);
        return new ResponseEntity<>(count,HttpStatus.OK);
    }

    //删除
    @RequestMapping(value = "appraise/{lid}",method = RequestMethod.DELETE)
    public  ResponseEntity<?> delete(@PathVariable("lid")Integer lid){
        int count=appraiseService.remove(lid);
        return new ResponseEntity<>(count,HttpStatus.OK);
    }
}
