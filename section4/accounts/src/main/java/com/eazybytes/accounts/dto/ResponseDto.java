package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Schema(
        name = "Response",
        description = "Response details"
)
@Data
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class ResponseDto {

    @Schema(description = "Status code", example = "201")
    String statusCode;

    @Schema(description = "Message", example = "Account created successfully")
    String message;
}
