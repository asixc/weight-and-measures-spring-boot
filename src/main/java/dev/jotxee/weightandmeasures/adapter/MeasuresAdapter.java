package dev.jotxee.weightandmeasures.adapter;

import dev.jotxee.weightandmeasures.controller.dto.MeasuresDto;
import dev.jotxee.weightandmeasures.respository.entity.MeasuresEntity;

import java.time.format.DateTimeFormatter;

public interface MeasuresAdapter {
    static MeasuresDto from (MeasuresEntity entity) {
        return new MeasuresDto(
                entity.getMeasurementsKey().getUserId(),
                entity.getMeasurementsKey().getRegistrationDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                // entity.getUserId(),
                // entity.getRegistrationDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                entity.getWeight(),
                entity.getChest(),
                entity.getWaist(),
                entity.getAbdomen(),
                entity.getHips(),
                entity.getButtocks());
    }
}
