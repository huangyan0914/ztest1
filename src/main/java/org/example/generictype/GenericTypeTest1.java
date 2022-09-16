package org.example.generictype;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericTypeTest1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

    }

    public <T> T getObject(Class<T> c) throws InstantiationException, IllegalAccessException {
        T t = c.newInstance();
        return t;
    }


    public <T> T[] list2Arr(List<T> list) {

        String[] aa = new String[3];
        int size = list.size();

        return null;
    }
}
