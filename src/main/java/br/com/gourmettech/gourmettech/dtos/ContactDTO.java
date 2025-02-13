package br.com.gourmettech.gourmettech.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ContactDTO(
    @NotBlank(message = "Phone number cannot be blank") String phone,
    @Email(message = "Email should be valid") @NotBlank(message = "Email cannot be blank") String email
) {}
