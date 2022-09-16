package org.example.observer;

public class ObserverEvent {
    ObserverableA observerableA;

    String eventName;

    public ObserverEvent(String eventName) {
        this.eventName = eventName;
    }
}
