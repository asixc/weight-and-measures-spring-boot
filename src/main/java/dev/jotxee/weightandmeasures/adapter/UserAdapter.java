package dev.jotxee.weightandmeasures.adapter;

import dev.jotxee.weightandmeasures.controller.dto.UserDto;
import dev.jotxee.weightandmeasures.respository.entity.Users;

public interface UserAdapter {
    static UserDto from (Users user) {
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getLast_name(),
                user.getBorn(),
                user.getCreated_at(),
                user.getUpdated_at());
    }
}
