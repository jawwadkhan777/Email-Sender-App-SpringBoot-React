package com.project.emailSenderApp.Helper;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailRequest {

    private String to;

    private String subject;

    private String message;
}
