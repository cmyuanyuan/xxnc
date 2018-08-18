package com.xxnc.pojo;

public class Shopping {
    private int gid;         // 'ID'
    private int gnumber;     //'数量'
    private int sid;         //'商品id'
    private int yid;         //'用户id'

    public Shopping() {
    }

    public Shopping(int gid, int gnumber, int sid, int yid) {
        this.gid = gid;
        this.gnumber = gnumber;
        this.sid = sid;
        this.yid = yid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getGnumber() {
        return gnumber;
    }

    public void setGnumber(int gnumber) {
        this.gnumber = gnumber;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getYid() {
        return yid;
    }

    public void setYid(int yid) {
        this.yid = yid;
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "gid=" + gid +
                ", gnumber=" + gnumber +
                ", sid=" + sid +
                ", yid=" + yid +
                '}';
    }
}
