package lk.boralesgamuwaMedical.asset.discountRatio.entity;


import lk.boralesgamuwaMedical.asset.discountRatio.entity.Enum.DiscountRatioStatus;
import lombok.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class DiscountRatio {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;


    private String name;


    @Column( nullable = false, precision = 10, scale = 2 )
    private BigDecimal amount;


    private DiscountRatioStatus discountRatioStatus;

/*    @OneToMany
    @JoinColumn(name = "discount_ratio_id")
    private List<Invoice> invoices = new ArrayList<>();*/


}
