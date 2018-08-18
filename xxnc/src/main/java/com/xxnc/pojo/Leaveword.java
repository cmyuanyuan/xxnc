package com.xxnc.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Leaveword implements Serializable {

    private Integer lid;
    private Integer yid;
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")//controller 转换 json
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ldate;
    private String lleaveword;

    //user 表
    private String yusername;

    public Leaveword() {
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getYid() {
        return yid;
    }

    public void setYid(Integer yid) {
        this.yid = yid;
    }

    public Date getLdate() {
        return ldate;
    }

    public void setLdate(Date ldate) {
        this.ldate = ldate;
    }

    public String getLleaveword() {
        return lleaveword;
    }

    public void setLleaveword(String lleaveword) {
        this.lleaveword = lleaveword;
    }

    public String getYusername() {
        return yusername;
    }

    public void setYusername(String yusername) {
        this.yusername = yusername;
    }
}
