package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
        name = "ErrorResponse",
        description = "Error response details"
)
@Data
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class ErrorResponseDto {

    @Schema(
            description = "API path",
            example = "/api/v1/accounts"
    )
    String apiPath;

    @Schema(
            description = "HTTP error code",
            example = "404"
    )
    HttpStatus errorCode;

    @Schema(
            description = "Error message",
            example = "Account not found"
    )
    String errorMessage;

    @Schema(
            description = "Error time",
            example = "2021-07-01T10:00:00"
    )
    LocalDateTime errorTime;

}
