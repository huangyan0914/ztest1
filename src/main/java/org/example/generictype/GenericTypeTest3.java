package org.example.generictype;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GenericTypeTest3 {

    public static void main(String[] args) throws Exception {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);  //这样调用 add 方法只能存储整形，因为泛型类型的实例为 Integer

        //在程序中定义了一个ArrayList泛型类型实例化为Integer对象，如果直接调用add()方法，那么只能存储整数数据，
        // 不过当我们利用反射调用add()方法的时候，却可以存储字符串，
        // 这说明了Integer泛型实例在编译之后被擦除掉了，只保留了原始类型
        list.getClass().getMethod("add", Object.class).invoke(list, "asd");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        String str = newTclass(String.class);
    }

    static <T> T newTclass (Class < T > clazz) throws InstantiationException, IllegalAccessException { T obj = clazz.newInstance(); return obj; }

}
