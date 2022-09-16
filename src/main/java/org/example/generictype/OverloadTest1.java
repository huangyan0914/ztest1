package org.example.generictype;

import java.util.Date;

public class OverloadTest1 {
    public String test(Date date) {
        System.out.println("test--date");
        return null;
    }
    public String test(Object obj) {
        System.out.println("test--obj");
        return null;
    }
    public String getVal() {
        return null;
    }
//    public Integer getVal() {
//        return null;
//    }

    public static void main(String[] args) {
        OverloadTest1 obj = new OverloadTest1();

        Date date1 = new Date();
        Object date2 = new Date();
        Object date3 = "xx";

        System.out.println(obj.test(date1));
        System.out.println(obj.test(date2));
        System.out.println(obj.test(date3));
    }
}
