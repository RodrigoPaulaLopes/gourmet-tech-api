package br.com.gourmettech.gourmettech.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Contact {
    

    private String email;
    private String phoneNumber;
}
