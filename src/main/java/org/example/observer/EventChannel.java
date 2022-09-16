package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class EventChannel {
    List<ObserverInterf> observerInterfList = new ArrayList<>();

    public void register(ObserverInterf observerInterf) {
        observerInterfList.add(observerInterf);
    }

    public void fireEvent(ObserverEvent event) {
        System.out.println("fire event");
//        ObserverEvent event = new ObserverEvent(eventName);
//        event.observerableA = this;
        for(ObserverInterf aObserver : observerInterfList) {
            aObserver.onUpdate(event);
        }
    }
}
