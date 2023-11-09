package dev.jotxee.weightandmeasures.service;

import dev.jotxee.weightandmeasures.adapter.MedidasAdapter;
import dev.jotxee.weightandmeasures.controller.dto.MedidasDto;
import dev.jotxee.weightandmeasures.controller.dto.MedidasForm;
import dev.jotxee.weightandmeasures.respository.MedidasRepository;
import dev.jotxee.weightandmeasures.respository.entity.MeasurementsKey;
import dev.jotxee.weightandmeasures.respository.entity.MedidasEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MedidasService {

    private final MedidasRepository medidasRepository;

    @Transactional
    public void guardarMedidas(final MedidasForm medidasForm, final int userId) {
        final MedidasEntity medidasEntity = MedidasEntity.builder()
                .measurementsKey(new MeasurementsKey(userId, getDate(medidasForm)))
                // .userId(userId)
                // .registrationDate(getDate(medidasForm))
                .weight(medidasForm.weight())
                .chest(medidasForm.chest())
                .waist(medidasForm.waist())
                .abdomen(medidasForm.abdomen())
                .hips(medidasForm.hips())
                .buttocks(medidasForm.buttocks())
                .build();

        medidasRepository.save(medidasEntity);
    }

    private LocalDate getDate(MedidasForm medidasForm) {

        return medidasForm.registrationDate() != null ?
                LocalDate.parse(medidasForm.registrationDate()) :
                LocalDate.now();
    }

    @Transactional()
    public List<MedidasDto> getAllMedidasByUsuario(final int userId) {
        return medidasRepository.findAllCustom(userId).stream().map(MedidasAdapter::from).toList();
    }

}