package org.example.generictype2;

public abstract class CustomEnum<E extends CustomEnum> implements Comparable<E> {
 
    protected final String name;
    protected final int ordinal;
 
    protected CustomEnum(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }
 
    public final String name() {
        return name;
    }
    public final int ordinal() {
        return ordinal;
    }
 
    @Override
    public int compareTo(E o) {
        return ordinal - o.ordinal;
    }
}