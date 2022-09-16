package org.example.factory.simple;

public class YunwaNotifyMessageHandler implements YunwaNotifyTopicHandler {
    @Override
    public void processNotiy(YunwaNotifyDto yunwaNotifyDto) {
        System.out.println("process message notify");
    }
}
