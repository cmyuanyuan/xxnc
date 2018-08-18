package com.xxnc.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -1110180107990284452L;
    private Integer yid;//用户id
    private String yname;//账号
    private String ypassword;//账号密码
    private String yusername;//用户名
    private String phone;//用户电话
    private String yemail;//电子邮箱
    private String yroot;//用户权限

    public User() {
    }

    public User(Integer yid, String yname, String ypassword, String yusername, String phone, String yemail, String yroot) {
        this.yid = yid;
        this.yname = yname;
        this.ypassword = ypassword;
        this.yusername = yusername;
        this.phone = phone;
        this.yemail = yemail;
        this.yroot = yroot;
    }

    public Integer getYid() {
        return yid;
    }

    public void setYid(int yid) {
        this.yid = yid;
    }

    public String getYname() {
        return yname;
    }

    public void setYname(String yname) {
        this.yname = yname;
    }

    public String getYpassword() {
        return ypassword;
    }

    public void setYpassword(String ypassword) {
        this.ypassword = ypassword;
    }

    public String getYusername() {
        return yusername;
    }

    public void setYusername(String yusername) {
        this.yusername = yusername;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getYemail() {
        return yemail;
    }

    public void setYemail(String yemail) {
        this.yemail = yemail;
    }


    public String getYroot() {
        return yroot;
    }

    public void setYroot(String yrood) {
        this.yroot = yroot;
    }

    @Override
    public String toString() {
        return "User{" +
                "yid=" + yid +
                ", yname='" + yname + '\'' +
                ", ypassword='" + ypassword + '\'' +
                ", yusername='" + yusername + '\'' +
                ", phone='" + phone + '\'' +
                ", yemail='" + yemail + '\'' +
                ", yroot=" + yroot +
                '}';
    }
}
