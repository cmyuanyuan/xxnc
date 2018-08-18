package com.xxnc.pojo;

public class Commodity {
    private Integer sid;      //'ID'
    private String sname;     //'商品名称'
    private String simg;      //'商品图片'
    private Integer swegiht;    //'总重量'
    private Double sprice;     //'售价'
    private String sautochthonous;  //'产原地（发货地）'
    private String spredicable;    //'产品属性'
    private String ssuggest;       // '产品介绍
    private String svender;        //'生产厂家'
    private String service;        //'售后服务

    public Commodity() {
    }

    public Commodity(Integer sid, String sname, String simg, Integer swegiht, Double sprice, String sautochthonous, String spredicable, String ssuggest, String svender, String service) {
        this.sid = sid;
        this.sname = sname;
        this.simg = simg;
        this.swegiht = swegiht;
        this.sprice = sprice;
        this.sautochthonous = sautochthonous;
        this.spredicable = spredicable;
        this.ssuggest = ssuggest;
        this.svender = svender;
        this.service = service;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
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

    public Integer getSwegiht() {
        return swegiht;
    }

    public void setSwegiht(Integer swegiht) {
        this.swegiht = swegiht;
    }

    public Double getSprice() {
        return sprice;
    }

    public void setSprice(Double sprice) {
        this.sprice = sprice;
    }

    public String getSautochthonous() {
        return sautochthonous;
    }

    public void setSautochthonous(String sautochthonous) {
        this.sautochthonous = sautochthonous;
    }

    public String getSpredicable() {
        return spredicable;
    }

    public void setSpredicable(String spredicable) {
        this.spredicable = spredicable;
    }

    public String getSsuggest() {
        return ssuggest;
    }

    public void setSsuggest(String ssuggest) {
        this.ssuggest = ssuggest;
    }

    public String getSvender() {
        return svender;
    }

    public void setSvender(String svender) {
        this.svender = svender;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", simg='" + simg + '\'' +
                ", swegiht=" + swegiht +
                ", sprice=" + sprice +
                ", sautochthonous='" + sautochthonous + '\'' +
                ", spredicable='" + spredicable + '\'' +
                ", ssuggest='" + ssuggest + '\'' +
                ", svender='" + svender + '\'' +
                ", service='" + service + '\'' +
                '}';
    }
}
