package br.com.gourmettech.gourmettech.dtos;

import br.com.gourmettech.gourmettech.entities.Contact;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ListContactDTO(
        String phone,
        String email) {

    public ListContactDTO(Contact contact){
        this(contact.getEmail(), contact.getPhone());
    }
}
