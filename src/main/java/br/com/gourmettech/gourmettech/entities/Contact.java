package br.com.gourmettech.gourmettech.entities;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Contact {

    private String email;
    private String phone;
}
