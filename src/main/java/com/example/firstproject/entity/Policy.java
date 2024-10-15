package com.example.firstproject.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="policy")
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tid;
    @Column(name="Policy_name")
    private String policyName;
    @Column(name="Policy_Holder")
    private String holderName;
    @Column(name="Status")
    private String status;
    @Column(name="Activated_date")
    private String sDate;
    private Long period;
}
