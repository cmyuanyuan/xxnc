package com.xxnc.controller;

import com.xxnc.pojo.CustomErrorMessage;
import com.xxnc.pojo.Shopping;
import com.xxnc.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:8080",maxAge = 3600)
@RestController
@RequestMapping("api/")
public class ShoppingController {
    @Autowired
    private ShoppingService shoppingService;
    // get: http://127.0.0.1:8086/s/api/shoppings
    // get: http://127.0.0.1:8086/s/api/shoppings?name=xxx
    // get: http://127.0.0.1:8086/s/api/shoppings?name=xxx&beginDate=xxx&endDate=xxx
    @RequestMapping(value = "shoppings",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Shopping>> list(
    ){
        List<Shopping> cars=shoppingService.find();
        if (cars.isEmpty()){
            return new ResponseEntity(new CustomErrorMessage("没有数据"),HttpStatus.OK);
            //return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(cars,HttpStatus.OK);
    }
//    //根据id查询
//    // get: http://127.0.0.1:8086/s/api/shoppings/2
    @RequestMapping(value = "shoppings/{gid}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> findById(
            @PathVariable("gid")Integer gid
    ){
        Shopping shopping=shoppingService.find(gid);
        if (shopping==null){
            return new ResponseEntity(new CustomErrorMessage("没有此id"),HttpStatus.OK);
            //return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(shopping,HttpStatus.OK);
    }
    //增加
    // post: http://127.0.0.1:8086/s/api/shoppings
    @RequestMapping(value = "shoppings",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> create(@RequestBody Shopping shopping){
        int count=shoppingService.add(shopping);
        if (count>0){
            return new ResponseEntity<>(count,HttpStatus.OK);
        }
        return new ResponseEntity(new CustomErrorMessage("增加失败"),HttpStatus.OK);
        //return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    //修改
    // put: http://127.0.0.1:8086/s/api/shoppings
    @RequestMapping(value = "shoppings",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> modify(@RequestBody Shopping shopping){
        int count=shoppingService.modify(shopping);
        if (count>0){
            return new ResponseEntity<>(count,HttpStatus.OK);
        }
        return new ResponseEntity(new CustomErrorMessage("修改失败"),HttpStatus.OK);
        //return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    //删除
    // delete: http://127.0.0.1:8086/s/api/shoppings/3
    @RequestMapping(value = "shoppings/{gid}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> romove(
            @PathVariable("gid")Integer gid
    ){
        int count=shoppingService.remove(gid);
        if (count>0){
            return new ResponseEntity<>(count,HttpStatus.OK);
        }
        return new ResponseEntity(new CustomErrorMessage("删除失败"),HttpStatus.OK);
        //return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
