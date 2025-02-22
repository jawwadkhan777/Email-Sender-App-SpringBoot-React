package com.project.emailSenderApp;


import com.project.emailSenderApp.services.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
public class EmailSenderTest {

    @Autowired
    private EmailService emailService;

    @Test
    void emailTest() {
        System.out.println("Sending Email");
        emailService.sendEmail("jks03132@gmail.com", "Email Testing", "This email has been sent from spring boot project.");
    }


    @Test
    void emailWithHtmlTest() {
        String htmlContent = "<h1 style='color:green; border:1px solid green;'>Welcome From Spring Boot</h1>";
        emailService.sendEmailWithHtml("jks03132@gmail.com", "Email with HTML testing", htmlContent);
    }

    @Test
    void emailWithFileTest() {
        emailService.sendEmailWithFile("jks03132@gmail.com", "Email with file testing", "Sent an attachment.", new File("J:\\Portfolio\\Java-Developer\\emailSenderApp\\src\\main\\resources\\static\\files\\Jawwad Khan CS Resume.pdf"));
    }


    @Test
    void emailWithFileStreamTest() {
        File file = new File("J:\\Portfolio\\Java-Developer\\emailSenderApp\\src\\main\\resources\\static\\files\\Jawwad Khan CS Resume.pdf");
        try {
            InputStream inputStream = new FileInputStream(file);
            emailService.sendEmailWithFile("jks03132@gmail.com", "Email with file testing", "Sent an attachment.", inputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
