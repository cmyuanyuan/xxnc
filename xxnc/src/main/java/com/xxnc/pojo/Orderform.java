package com.xxnc.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

public class Orderform implements Serializable {
    private  Integer did;
    private  String yid;
    private  String sid;
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")//controller 转换 json
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ddate;
    private Integer dnumber;
    private Double dprice;
    private  String dstatus;

    //user表内容
    private  String yusername;

    //commodity表内容
    private String sname;
    private  String simg;
    private  Double sprice;

    public Orderform() {
    }

    public Double getDprice() {
        return dprice;
    }

    public void setDprice(Double dprice) {
        this.dprice = dprice;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getYid() {
        return yid;
    }

    public void setYid(String yid) {
        this.yid = yid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Date getDdate() {
        return ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }

    public Integer getDnumber() {
        return dnumber;
    }

    public void setDnumber(Integer dnumber) {
        this.dnumber = dnumber;
    }

    public String getDstatus() {
        return dstatus;
    }

    public void setDstatus(String dstatus) {
        this.dstatus = dstatus;
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

    public Double getSprice() {
        return sprice;
    }

    public void setSprice(Double sprice) {
        this.sprice = sprice;
    }
}
