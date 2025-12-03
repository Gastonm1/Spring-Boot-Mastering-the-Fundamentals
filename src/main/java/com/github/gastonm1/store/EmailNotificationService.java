package com.github.gastonm1.store;

import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
       System.out.println("Sending email: " + message);
    }
}
