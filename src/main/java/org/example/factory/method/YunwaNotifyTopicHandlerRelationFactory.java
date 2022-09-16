package org.example.factory.method;

import org.example.factory.simple.YunwaNotifyMessageHandler;
import org.example.factory.simple.YunwaNotifyRelationHandler;
import org.example.factory.simple.YunwaNotifyTopicHandler;

public class YunwaNotifyTopicHandlerRelationFactory implements YunwaNotifyTopicHandlerFactoryInterf {
    @Override
    public YunwaNotifyTopicHandler getHandler() {
        return new YunwaNotifyRelationHandler();
    }
}
