package dev.jotxee.weightandmeasures.respository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
@Table(name = "measurements")
@NoArgsConstructor
@AllArgsConstructor
public class MedidasEntity implements Serializable {
    @EmbeddedId
    private MeasurementsKey measurementsKey;
    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;
    private Double weight;
    private Double chest, waist, abdomen, hips;
    private Double buttocks;
}
