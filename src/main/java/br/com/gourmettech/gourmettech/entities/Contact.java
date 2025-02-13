package br.com.gourmettech.gourmettech.entities;

import br.com.gourmettech.gourmettech.dtos.ContactDTO;
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
public class Contact {

    private String email;
    private String phone;
    
    public Contact(ContactDTO dto) {
        this.setEmail(dto.email());
        this.setPhone(dto.phone());
    }

    
}
