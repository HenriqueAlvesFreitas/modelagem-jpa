package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.PaymentMethodEnum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Purchase")
public class Purchase {

    @Id
    private String email;

    @Id
    private int track_id;

    private PaymentMethodEnum payment_method;

    private LocalDate date;

    private LocalTime time;

    @ManyToOne
    @JoinColumn(name = "track_id")
    private Track Track;

    @ManyToOne
    @JoinColumn(name = "email")
    private Costumer Costumer;
}
