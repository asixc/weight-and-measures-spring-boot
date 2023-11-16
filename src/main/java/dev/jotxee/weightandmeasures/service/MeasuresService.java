package dev.jotxee.weightandmeasures.service;

import dev.jotxee.weightandmeasures.adapter.MeasuresAdapter;
import dev.jotxee.weightandmeasures.controller.dto.MeasuresDto;
import dev.jotxee.weightandmeasures.controller.dto.Measures;
import dev.jotxee.weightandmeasures.respository.MeasuresRepository;
import dev.jotxee.weightandmeasures.respository.entity.MeasurementsKey;
import dev.jotxee.weightandmeasures.respository.entity.MeasuresEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MeasuresService {

    private final MeasuresRepository measuresRepository;

    @Transactional
    public void save(final Measures measures, final int userId) {
        final MeasuresEntity measuresEntity = MeasuresEntity.builder()
                .measurementsKey(new MeasurementsKey(userId, getDate(measures)))
                .weight(measures.weight())
                .chest(measures.chest())
                .waist(measures.waist())
                .abdomen(measures.abdomen())
                .hips(measures.hips())
                .buttocks(measures.buttocks())
                .build();

        measuresRepository.save(measuresEntity);
    }

    private LocalDate getDate(Measures measures) {

        return measures.registrationDate() != null ?
                LocalDate.parse(measures.registrationDate()) :
                LocalDate.now();
    }

    @Transactional()
    public List<MeasuresDto> getAllMeasuresByUser(final int userId) {
        return measuresRepository.findAllCustom(userId).stream().map(MeasuresAdapter::from).toList();
    }

}