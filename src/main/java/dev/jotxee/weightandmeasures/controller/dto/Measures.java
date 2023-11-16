package dev.jotxee.weightandmeasures.controller.dto;

import jakarta.validation.constraints.NotNull;

public record Measures(
        String registrationDate,
        @NotNull(message="Weight is mandatory")
        Double weight,
        @NotNull(message="Chest is mandatory")
        Double chest,
        @NotNull(message="Waist is mandatory")
        Double waist,
        Double abdomen,
        @NotNull(message="Hips is mandatory")
        Double hips,
        Double buttocks
) { }


/*
@Serdeable
@Introspected
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedidasForm {
        @NonNull
        @NotBlank
        final Double weight;
       // @JsonInclude(JsonInclude.Include.NON_NULL)
        @Nullable
        final Double chest;

        @Nullable
        final  Double waist;

        @Nullable
        final Double abdomen;

        @NonNull
        final Double hips;

        @Nullable
        final Double buttocks;
        MedidasForm (@NonNull Double weight, @Nullable Double chest, @NonNull Double waist,
                     @Nullable Double abdomen, @NonNull Double hips, @Nullable Double buttocks){
               this.weight = weight;
               this.chest = chest;
               this.waist = waist;
               this.abdomen = abdomen;
               this.hips = hips;
               this.buttocks = buttocks;
        }
}
@Slf4j
@Introspected
@Serdeable
public class MedidasForm {
    @Nullable
    private Double weight;
    @Nullable
    private Double chest;
    @Nullable
    private Double waist;
    @Nullable
    private Double abdomen;
    @Nullable
    private Double hips;
    @Nullable
    private Double buttocks;
    public MedidasForm (){}

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        log.info("aaaaa");
        this.weight = weight;
    }

    public Double getChest() {
        return chest;
    }

    public void setChest(Double chest) {
        this.chest = chest;
    }

    public Double getWaist() {
        return waist;
    }

    public void setWaist(Double waist) {
        this.waist = waist;
    }

    public Double getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(Double abdomen) {
        this.abdomen = abdomen;
    }

    public Double getHips() {
        return hips;
    }

    public void setHips(Double hips) {
        this.hips = hips;
    }

    public Double getButtocks() {
        return buttocks;
    }

    public void setButtocks(Double buttocks) {
        this.buttocks = buttocks;
    }
}*/