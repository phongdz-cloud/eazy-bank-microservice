package com.eazybytes.accounts.dto;

import com.eazybytes.accounts.entity.Customer;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

/**
 * DTO for {@link Customer}
 */
@Data
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Schema(
        name = "Customer",
        description = "Customer details"
)
public class CustomerDto implements Serializable {

    Long customerId;

    @Schema(description = "Name of the customer", example = "John Doe")
    @NotEmpty(message = "Name is required")
            @Size(min = 5, max = 30, message = "Name should be between 5 and 30 characters")
    String name;

    @Schema(
            description = "Email of the customer",
            example = "[email protected]"
    )
    @NotEmpty(message = "Email is required")
    @Email(message = "Email is invalid")
    String email;

    @Schema(
            description = "Mobile number of the customer",
            example = "9876543210"
    )
    @Pattern(regexp = "^$|[0-9]{10}$", message = "Mobile number is invalid")
    String mobileNumber;

    @Schema(
            description = "Accounts details of the customer"
    )
    AccountsDto accountsDto;

}