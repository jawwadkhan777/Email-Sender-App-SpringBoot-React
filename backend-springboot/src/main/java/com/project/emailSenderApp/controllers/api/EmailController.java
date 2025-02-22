package com.project.emailSenderApp.controllers.api;


import com.project.emailSenderApp.Helper.CustomResponse;
import com.project.emailSenderApp.Helper.EmailRequest;
import com.project.emailSenderApp.services.EmailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/email")
public class EmailController {

    private EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public ResponseEntity<?> sendEmail(@RequestBody EmailRequest emailRequest) {

        emailService.sendEmailWithHtml(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getMessage());

        return ResponseEntity.ok(CustomResponse.builder().message("Email send successfully").httpStatus(HttpStatus.OK).status(true).build());
    }

    @PostMapping("/send-with-file")
    public ResponseEntity<CustomResponse> sendEmailWithFile(@RequestPart EmailRequest emailRequest, @RequestPart MultipartFile file) throws IOException {
        emailService.sendEmailWithFile(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getMessage(), file.getInputStream());
        return ResponseEntity.ok(CustomResponse.builder().message("Email send successfully").httpStatus(HttpStatus.OK).status(true).build());

    }
}
