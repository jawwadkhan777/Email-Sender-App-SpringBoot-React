package com.project.emailSenderApp.Helper;


import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.PrimitiveIterator;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CustomResponse {

    private String message;

    private HttpStatus httpStatus;

    private boolean status = false;
}
