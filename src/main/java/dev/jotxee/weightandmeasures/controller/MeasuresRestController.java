package dev.jotxee.weightandmeasures.controller;

import dev.jotxee.weightandmeasures.controller.dto.MeasuresDto;
import dev.jotxee.weightandmeasures.controller.dto.Measures;
import dev.jotxee.weightandmeasures.controller.dto.UserDto;
import dev.jotxee.weightandmeasures.service.MeasuresService;
import dev.jotxee.weightandmeasures.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1.0")
public class MeasuresRestController {

    private final MeasuresService measuresService;
    private final UserService userService;

    @PostMapping("/{userId}")
    public ResponseEntity<?> save(@Valid @RequestBody Measures measures, @PathVariable("userId") int userId) {
        log.debug("Guarda medidas de:{} [{}]", userId, measures);
        measuresService.save(measures, userId);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{userId}")
    public ResponseEntity<?> updatesMeasures(@RequestBody Measures measures, @PathVariable("userId") int userId) {
        log.debug("Actualiza medidas de:{} [{}]", userId, measures);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<MeasuresDto>> getAllMeasuresByUserId(@PathVariable("userId") int userId) {
        return ResponseEntity.ok().body(measuresService.getAllMeasuresByUser(userId));
    }

    @GetMapping("/")
    public ResponseEntity<List<UserDto>> getUsers() {
        return ResponseEntity.ok().body(userService.getAll());
    }

}

