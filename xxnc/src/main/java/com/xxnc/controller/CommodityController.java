package com.xxnc.controller;

import com.xxnc.pojo.Commodity;
import com.xxnc.pojo.CustomErrorMessage;
import com.xxnc.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:8080",maxAge = 3600)
@RestController
@RequestMapping("api/")
public class CommodityController {
    @Autowired
    private CommodityService commodityService;

    //查询
    //get:http://127.0.0.1:8086/s/api/commoditys
    @RequestMapping(value = "commoditys",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Commodity>> list(){
        List<Commodity> commoditys=commodityService.find();
        if (commoditys.isEmpty()){
            return new ResponseEntity(new CustomErrorMessage("没有数据"),HttpStatus.OK);
        }
        return new ResponseEntity<>(commoditys,HttpStatus.OK);
    }
    //根据id查询
    // get: http://127.0.0.1:8086/spring03/api/commoditys/2
    @RequestMapping(value = "commoditys/{sid}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> findById(
            @PathVariable("sid")Integer sid
    ){
        Commodity commodity=commodityService.find(sid);
        if (commodity==null){
            return new ResponseEntity(new CustomErrorMessage("没有此id"),HttpStatus.OK);
            //return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(commodity,HttpStatus.OK);
    }
}
