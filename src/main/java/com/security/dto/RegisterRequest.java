package com.security.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(
        @NotBlank(message = "Username is required")
                              String username,
                              @NotBlank(message = "Password is required")
                                      @Size(min = 8 ,message = "Password must be at least 8 characters")
                              String password,
                              @Email(message = "Email format is invalid")
                                      @NotBlank(message = "Email is required")
                              String email
)
{
}
