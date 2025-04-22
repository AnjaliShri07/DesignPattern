package com.designPattern.creational.NotificationFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificationFactory {
    private static final Map<String, Supplier<Notification>> processorMap = new HashMap<>();

    // Static block to initialize the map
    static {
        processorMap.put("email", EmailNotification::new);
        processorMap.put("sms", SMSNotification::new);

    }

    public Notification createNotification(String type) {
        Supplier<Notification> processorSupplier = processorMap.get(type.toLowerCase());
        if(processorSupplier != null){
            return processorSupplier.get();
        }else {
            throw new IllegalArgumentException("Unknown Notification type");
        }
    }
}
