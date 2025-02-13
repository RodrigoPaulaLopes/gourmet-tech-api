package br.com.gourmettech.gourmettech.entities;

import br.com.gourmettech.gourmettech.dtos.RestaurantDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "restaurants")
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String name;

    private Address address;

    private Contact contact;

    public Restaurant(RestaurantDTO dto) {
        setName(dto.name());
        setAddress(new Address(dto.address()));
        setContact(new Contact(dto.contact()));
    }

    
}
