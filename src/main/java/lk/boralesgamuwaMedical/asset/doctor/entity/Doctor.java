package lk.boralesgamuwaMedical.asset.doctor.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lk.boralesgamuwaMedical.asset.commonAsset.model.Enum.Gender;
import lk.boralesgamuwaMedical.asset.commonAsset.model.Enum.Title;
import lk.boralesgamuwaMedical.asset.consultation.entity.Consultation;
import lk.boralesgamuwaMedical.util.audit.AuditEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor extends AuditEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    @Enumerated(EnumType.STRING)
    private Title title;

    @Basic
    @Column(name = "name", length = 45)
    private String name;

    private String code;

    @Basic
    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToOne(fetch = FetchType.EAGER)
    private Consultation consultation;

    @Basic
    @Column(name = "slmc_number", unique = true)
    private Integer slmcNumber;

    @Basic
    @Column(name = "mobile")
    private String mobile = "No mobile number";

    @Basic
    @Column(name = "land", length = 10)
    private String land;

    @Basic
    @Email(message = "Please provide valid email")
    @Column(name = "email", length = 45)
    private String email;

    @Basic
    @Column(name = "description", length = 10)
    private String description;


    /*    @OneToMany(mappedBy = "doctor")
        private List<Invoice> invoices = new ArrayList<>();*/

}
