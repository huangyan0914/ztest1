package org.example.observer;

public class ObserverB implements ObserverInterf {
    @Override
    public void onUpdate(ObserverEvent ent) {
        System.out.println("observerb rev event,do business");
    }
}
