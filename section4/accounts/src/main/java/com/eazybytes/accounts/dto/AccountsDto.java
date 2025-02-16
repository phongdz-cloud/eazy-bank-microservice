package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

/**
 * DTO for {@link com.eazybytes.accounts.entity.Accounts}
 */
@Data
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Schema(
        name = "Accounts",
        description = "Accounts details"
)
public class AccountsDto implements Serializable {

    @Schema(description = "Account number", example = "1234567890")
    @NotEmpty(message = "Account number is required")
            @Pattern(regexp = "^$|[0-9]{10}", message = "Account number is invalid")
    Long accountNumber;

    Long customerId;

    @Schema(description = "Account type", example = "Savings")
    @NotEmpty(message = "Account type is required")
    String accountType;

    @Schema(description = "Branch address", example = "123, Main Street, Bangalore")
    @NotEmpty(message = "Branch address is required")
    String branchAddress;
}