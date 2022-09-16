package org.example.generictype;

public class Parent implements Comparable<Parent> {
    String name;

    @Override
    public int compareTo(Parent o) {
        return 0;
    }
}
