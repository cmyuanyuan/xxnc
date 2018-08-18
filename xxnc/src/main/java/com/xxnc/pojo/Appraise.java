package com.xxnc.pojo;

import java.io.Serializable;

public class Appraise implements Serializable {
    private Integer pid;   //id主键 自增
    private Integer sid;   //外键user表id
    private Integer yid;   //外键commodity表id
    private String pappraise;  //评价

    //user表
    private  String yusername;
    //商品表
    private String sname;
    private  String simg;

    public Appraise() {
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getYid() {
        return yid;
    }

    public void setYid(Integer yid) {
        this.yid = yid;
    }

    public String getPappraise() {
        return pappraise;
    }

    public void setPappraise(String pappraise) {
        this.pappraise = pappraise;
    }

    public String getYusername() {
        return yusername;
    }

    public void setYusername(String yusername) {
        this.yusername = yusername;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSimg() {
        return simg;
    }

    public void setSimg(String simg) {
        this.simg = simg;
    }
}
