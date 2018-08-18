package com.xxnc.controller;

import com.xxnc.pojo.CustomErrorMessage;
import com.xxnc.pojo.User;
import com.xxnc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 控制器类 | 页面处理器
 *
 * @author JH
 */
@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://127.0.0.1:8080", maxAge = 3600)
public class UserController {
    @Autowired
    private UserService userService;

    //账户登录
    @RequestMapping(value = "users",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> list(
            @RequestParam(value = "yname",required = true)String yname,
            @RequestParam(value = "ypassword",required = true)String ypassword
    ){
        User user = userService.find(yname,ypassword);
        if (user==null){
            return new ResponseEntity(400,HttpStatus.OK);
        }
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    //账户注册
    @RequestMapping(value = "users",method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody User user){
        int count = userService.add(user);
        return new ResponseEntity<>(count,HttpStatus.OK);
    }

    //用户修改
    @RequestMapping(value = "users",method = RequestMethod.PUT)
    public ResponseEntity<?> update(@RequestBody User user){
        int count = userService.modify(user);
        return new ResponseEntity<>(count,HttpStatus.OK);
    }

    //用户注销
    @RequestMapping(value = "users/{yid}",method = RequestMethod.DELETE)
    public ResponseEntity<?> remove(@PathVariable("yid")Integer yid){
        int count = userService.remove(yid);
        return new ResponseEntity<>(count,HttpStatus.OK);
    }
}
