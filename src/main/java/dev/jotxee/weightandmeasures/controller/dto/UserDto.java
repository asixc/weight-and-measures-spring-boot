package dev.jotxee.weightandmeasures.controller.dto;

import java.time.LocalDateTime;
import java.util.Date;

public record UserDto(
        int userId,
        String name,
        String last_name,
        Date date,
        LocalDateTime created_at,
        LocalDateTime updated_at
) {
}
