package com.designPattern.creational.NotificationFactory;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        // Send Email notification
        Notification emailNotification = factory.createNotification("email");
        emailNotification.sendNotification("Hello! This is a test email notification sent using JavaMail.");
    }
}

//spring-boot-starter-mail
//Add AWS SES Dependency
/*
<dependency>
    <groupId>software.amazon.awssdk</groupId>
    <artifactId>ses</artifactId>
    <version>2.17.89</version>
</dependency>
*/

//Add Mailgun Dependency
//Mailgun doesn’t have an official Java library, but you can use HTTP clients like OkHttp to call its API:
//<dependency>
//    <groupId>com.squareup.okhttp3</groupId>
//    <artifactId>okhttp</artifactId>
//    <version>4.9.1</version>
//</dependency>

