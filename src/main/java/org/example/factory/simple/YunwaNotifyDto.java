package org.example.factory.simple;

import lombok.Data;

@Data
public class YunwaNotifyDto {
    private String topic;
    private String payload;
    private String profilePlatformUid;
}
