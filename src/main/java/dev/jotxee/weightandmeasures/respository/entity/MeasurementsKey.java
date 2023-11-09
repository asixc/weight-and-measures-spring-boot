package dev.jotxee.weightandmeasures.respository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class MeasurementsKey implements Serializable {
    @Column(name = "id_user")
    private int userId;
    @Column(name = "registration_date")
    private LocalDate registrationDate;
}
