package org.example.observer;

public interface ObserverInterf {
    void onUpdate(ObserverEvent ent);

    /**
     * description 
     * @param
     * @return java.lang.String
     * @date 2022/9/16 11:13
     * @author huangyan
     */
    default String newMethod() {
        return "str";
    }
}
