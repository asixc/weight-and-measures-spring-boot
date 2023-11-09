package dev.jotxee.weightandmeasures.service;

import dev.jotxee.weightandmeasures.adapter.UserAdapter;
import dev.jotxee.weightandmeasures.controller.dto.UserDto;
import dev.jotxee.weightandmeasures.respository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public List<UserDto> getAll () {
        return userRepository.findAll().stream().map(UserAdapter::from).toList();
    }

}
