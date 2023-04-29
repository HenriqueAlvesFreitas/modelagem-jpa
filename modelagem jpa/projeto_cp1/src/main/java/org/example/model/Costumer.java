package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Costumer")
public class Costumer {
    @Id
    @Column(name = "email")
    private String email;
    private String name;
    private String password;
    private int age;

    private String card_information;
    private String IP_address;

    private String device;

    @OneToMany(mappedBy = "Costumer")
    private List<Purchase> Purchase;
}
