package org.example.factory.simple;

public class Client1 {
    public static void main(String[] args) {
        YunwaNotifyTopicHandlerFactory factory = new YunwaNotifyTopicHandlerFactory();

        YunwaNotifyTopicHandler handler = factory.getHandler("message");

//        handler = factory.getHandler(YunwaNotifyMessageHandler.class);

//        handler = factory.getHandler("message");

        handler.processNotiy(null);

    }
}
