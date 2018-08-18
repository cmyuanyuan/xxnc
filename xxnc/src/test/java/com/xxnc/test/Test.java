package com.xxnc.test;

import com.xxnc.pojo.User;

public class Test {
    public static void main(String[] args) {
        User user=new User();

        if (user==null){
            System.out.println(1);
        }else {
            System.out.println(2);
        }
    }
}
