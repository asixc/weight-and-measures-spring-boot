package dev.jotxee.weightandmeasures.controller.dto;

public record MedidasDto(
        int idUsuario,
        String registrationDate,
        Double pesoKg,
        Double pechoCm,
        Double cinturaCm,
        Double abdomenCm,
        Double caderaCm,
        Double culoCm
) { }
