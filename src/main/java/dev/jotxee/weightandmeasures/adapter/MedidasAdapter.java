package dev.jotxee.weightandmeasures.adapter;

import dev.jotxee.weightandmeasures.controller.dto.MedidasDto;
import dev.jotxee.weightandmeasures.respository.entity.MedidasEntity;

import java.time.format.DateTimeFormatter;

public interface MedidasAdapter {
    static MedidasDto from (MedidasEntity entity) {
        return new MedidasDto(
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
