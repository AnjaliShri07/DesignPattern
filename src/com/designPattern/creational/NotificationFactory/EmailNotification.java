package com.designPattern.creational.NotificationFactory;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class EmailNotification implements Notification{
    // Email server configuration
    private static final String HOST = "smtp.example.com"; // Replace with your SMTP server
    private static final String PORT = "587";              // Replace with your SMTP port
    private static final String USERNAME = "your-email@example.com"; // Your email address
    private static final String PASSWORD = "your-email-password";    // Your email password

    @Override
    public void sendNotification(String message) {
        // Recipient's email ID needs to be mentioned.
        String to = "recipient@example.com"; // Replace with recipient's email

        // Sender's email ID needs to be mentioned
        String from = USERNAME;

        // Setup mail server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", HOST);
        properties.put("mail.smtp.port", PORT);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true"); // Enable TLS

        // Get the Session object
        Session session = Session.getInstance(properties,
                new jakarta.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(USERNAME, PASSWORD);
                    }
                });

        try {
            // Create a default MimeMessage object
            Message mimeMessage = new MimeMessage(session);

            // Set From: header field
            mimeMessage.setFrom(new InternetAddress(from));

            // Set To: header field
            mimeMessage.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));

            // Set Subject: header field
            mimeMessage.setSubject("Notification Alert");

            // Set the actual message
            mimeMessage.setText(message);

            // Send message
            Transport.send(mimeMessage);

            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            System.err.println("Error sending email: " + e.getMessage());
        }
    }
}
