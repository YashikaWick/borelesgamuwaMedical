package lk.boralesgamuwaMedical.asset.doctor.entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import lk.boralesgamuwaMedical.asset.commonAsset.model.Enum.Gender;
import lk.boralesgamuwaMedical.asset.commonAsset.model.Enum.Title;
import lk.boralesgamuwaMedical.asset.doctor.entity.Enum.Consultation;
import lk.boralesgamuwaMedical.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("Doctor")
public class Doctor extends AuditEntity {
    @Size(min = 3, message = "Your name cannot be accepted")
    private String name;

    @Column(unique = true)
    private String code;

    @Size( max = 12, min = 10, message = "NIC number is contained numbers between 9 and X/V or 12 " )
    @Column( unique = true )
    private String nic;

    @Size( max = 10, message = "Mobile number length should be contained 10 and 9" )
    private String mobileOne;

    @Size( max = 10, message = "Mobile number length should be contained 10 and 9" )
    private String mobileTwo;

    @Column( unique = true )
    private String email;

    @Enumerated(EnumType.STRING)
    private Title title;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private Consultation consultation;



}
