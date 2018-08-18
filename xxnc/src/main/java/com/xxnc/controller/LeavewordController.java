package com.xxnc.controller;


import com.xxnc.pojo.CustomErrorMessage;
import com.xxnc.pojo.Leaveword;
import com.xxnc.service.LeavewordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:8080",maxAge = 3600)
@RestController
@RequestMapping("api/")
public class LeavewordController {
    @Autowired
    private LeavewordService leavewordService;

    //查询所有
    @RequestMapping(value = "leave", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Leaveword>> list(
    ) {
        List<Leaveword> cars = leavewordService.find();
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }

    //新增
    @RequestMapping(value = "leave",method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody Leaveword leaveword){
        int count=leavewordService.add(leaveword);
        return new ResponseEntity<>(count,HttpStatus.OK);
    }

    //删除
    @RequestMapping(value = "leave/{lid}",method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  ResponseEntity<?> remove(@PathVariable("lid")Integer lid){
        int count=leavewordService.remove(lid);
        if (count>0) {
            return new ResponseEntity<>(count, HttpStatus.OK);
        }
        return new ResponseEntity<>(new CustomErrorMessage("删除失败"),HttpStatus.OK);
    }

}
