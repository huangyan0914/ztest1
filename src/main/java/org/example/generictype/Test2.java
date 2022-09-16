//package org.example.generictype;
//
//import java.util.ArrayList;
//
//public class Test2 {
//    //类型检查就是针对引用的，谁是一个引用，
//    // 用这个引用调用泛型方法，就会对这个引用调用的方法进行类型检测，而无关它真正引用的对象。
//    public static void main(String[] args) {
//
//        ArrayList<String> list1 = new ArrayList();
//        list1.add("1"); //编译通过
//        list1.add(1); //编译错误
//        String str1 = list1.get(0); //返回类型就是String
//
//        ArrayList list2 = new ArrayList<String>();
//        list2.add("1"); //编译通过
//        list2.add(1); //编译通过
//        Object object = list2.get(0); //返回类型就是Object
//
//        new ArrayList<String>().add("11"); //编译通过
//        new ArrayList<String>().add(22); //编译错误
//
//        String str2 = new ArrayList<String>().get(0); //返回类型就是String
//
//        //在Java中，像下面形式的引用传递是不允许的:
//        ArrayList<String> list1 = new ArrayList<Object>(); //编译错误
//        ArrayList<Object> list2 = new ArrayList<String>(); //编译错误
////第一种情况可以看做如下代码
//        ArrayList<Object> list1 = new ArrayList<Object>();
//        list1.add(new Object());
//        list1.add(new Object());
//        ArrayList<String> list2 = list1; //编译错误，因为想要的是String类型，但实际的是object类型，ClassCastException
////第二种情况可以看做如下代码
//        ArrayList<String> list1 = new ArrayList<String>();
//        list1.add(new String());
//        list1.add(new String());
//        ArrayList<Object> list2 = list1; //编译错误，虽然没有类型转换异常，但是从String转换为Object有什么意义呢
////所以，要格外注意，泛型中的引用传递的问题。
//
//    }
//}
