package com.nakhaei.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class ApiError {

    private HttpStatus status;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy dd:mm:ss")
    private LocalDateTime timeStamp;

    private String message;
    private String debugMessage;
    private List<SubApiError> apiErrors;

    private ApiError() {
        this.timeStamp = LocalDateTime.now();
    }

    ApiError(HttpStatus status) {
        this();
        this.status = status;
    }

    ApiError(HttpStatus status, Throwable ex) {
        this();
        this.status = status;
        this.message = "unexpected exception";
        this.debugMessage = ex.getLocalizedMessage();
    }

    ApiError(HttpStatus status, String message, Throwable ex) {
        this();
        this.status = status;
        this.message = message;
        this.debugMessage = ex.getLocalizedMessage();
    }


}

abstract class SubApiError {

}

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
class apiValidationError extends SubApiError {
    private String field;
    private String object;
    private Object rejectValue;
    private String message;

    apiValidationError(String message, String object){
        this.object=object;
        this.message=message;
    }

}


