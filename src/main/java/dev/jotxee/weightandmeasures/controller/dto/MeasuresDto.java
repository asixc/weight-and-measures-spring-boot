package dev.jotxee.weightandmeasures.controller.dto;

public record MeasuresDto(
        int userId,
        String registrationDate,
        Double weight,
        Double chest,
        Double waist,
        Double abdomen,
        Double hips,
        Double buttocks
) { }
