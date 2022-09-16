package org.example.generictype2;

public class ParamUpperBound {
    public static void main(String[] args) {
        Color red = new Color("red", 0);
        Color green = new Color("green", 1);
        WeekDay monday = new WeekDay("monday", 2);
 
        red.compareTo(green);
//        monday.compareTo(red);
    }
}