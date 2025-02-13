package br.com.gourmettech.gourmettech.entities;

import br.com.gourmettech.gourmettech.dtos.AddressDTO;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    
    private String street;
    private String number;
    private String city;
    private String state;
    private String zipCode;

    public Address(AddressDTO dto) {
        this.setStreet(dto.street());
        this.setNumber(dto.number());
        this.setCity(dto.city());
        this.setState(dto.state());
        this.setZipCode(dto.zipCode());
    }


    
}
