package com.example.firstproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PolicyDto {
    private long tid;
    private String policyName;
    private String holderName;
    private String status;
    private String sDate;
    private Long period;
}