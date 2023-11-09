package dev.jotxee.weightandmeasures.respository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    private int id;
    private String name, last_name;
    private Date born;
    private LocalDateTime created_at, updated_at;
}
