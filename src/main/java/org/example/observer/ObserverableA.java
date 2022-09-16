package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverableA {

    EventChannel eventChannel;

    public void fireEvent(String eventName) {
        ObserverEvent event = new ObserverEvent(eventName);
        event.observerableA = this;

        eventChannel.fireEvent(event);
    }
}
