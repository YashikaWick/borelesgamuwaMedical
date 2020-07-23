package lk.boralesgamuwaMedical.asset.doctor.entity.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Consultation {
    ALLERGY_AND_IMMUNOLOGY("Allergy and Immunology"),
    ALLERGY_SPECIALIST("Allergy Specialist"),
    CARDIOLOGIST("Cardiologist") ;


    private final String Consultation;
}
