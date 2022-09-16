package org.example.observer;

public class ObserverTestClient {
    public static void main(String[] args) {
        ObserverableA observerableA = new ObserverableA();

        EventChannel eventChannel = new EventChannel();
        observerableA.eventChannel = eventChannel;

        eventChannel.register(new ObserverB());

        observerableA.fireEvent("modifyevent");
    }
}
