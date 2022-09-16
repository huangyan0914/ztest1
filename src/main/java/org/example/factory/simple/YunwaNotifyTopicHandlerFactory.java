package org.example.factory.simple;

public class YunwaNotifyTopicHandlerFactory {
    public YunwaNotifyTopicHandler getHandler(String topic) {
        switch (topic) {
            case "message" :
                return new YunwaNotifyMessageHandler();
            case "bb"  :
                return new YunwaNotifyRelationHandler();
            default:
                return null;
        }
    }

    public YunwaNotifyTopicHandler getHandler(Class<YunwaNotifyTopicHandler> clz) {
        try {
            return clz.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public YunwaNotifyTopicHandler getHandlerByClzName(String clzName) {
        Class<YunwaNotifyTopicHandler> clz = null;
        try {
            clz = (Class<YunwaNotifyTopicHandler>)Class.forName(clzName);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return getHandler(clz);
    }
}
