package com.project.emailSenderApp.services;

import java.io.File;
import java.io.InputStream;

public interface EmailService {

//    method to send email to single person
    void sendEmail(String to, String subject, String message);

//    method to send email to multiple persons
    void sendEmail(String [] to, String subject, String message);

//    method to send files in email
    void sendEmailWithFile(String to, String subject, String message, File file);

//    method to send html content with email
    void sendEmailWithHtml(String to, String subject, String htmlContent);

//    method to send files in email
    void sendEmailWithFile(String to, String subject, String message, InputStream inputStream);


}
