package org.example.factory.method;

import org.example.factory.simple.YunwaNotifyTopicHandler;
import org.example.factory.simple.YunwaNotifyTopicHandlerFactory;

public class Client2 {
    public static void main(String[] args) {
        YunwaNotifyTopicHandlerFactoryInterf factory = new YunwaNotifyTopicHandlerMessageFactory();
        YunwaNotifyTopicHandler handler = factory.getHandler();
        handler.processNotiy(null);

    }
}
