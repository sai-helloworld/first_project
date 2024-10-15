//package com.example.firstproject.mapper;
//
//import com.example.firstproject.dto.PolicyDto;
//import com.example.firstproject.entity.Policy;
//
//public class PolicyMapper {
//    public static PolicyDto mapToPolicyDto(Policy policy){
//        return new PolicyDto(
//                policy.getTid(),
//                policy.getPolicyName(),
//                policy.getHolderName(),
//                policy.getSDate(),
//                policy.getPeriod()
//        );
//    }
//    public static Policy mapToPolicy(PolicyDto policyDto){
//        return new Policy(
//                policy.getTid(),
//                policy.getPolicyName(),
//                policy.getHolderName(),
//                policy.getSDate(),
//                policy.getPeriod()
//        );
//    }
//}



package com.example.firstproject.mapper;

import com.example.firstproject.dto.PolicyDto;
import com.example.firstproject.entity.Policy;

public class PolicyMapper {

    // Convert Policy entity to PolicyDto
    public static PolicyDto mapToPolicyDto(Policy policy) {
        return new PolicyDto(
                policy.getTid(),
                policy.getPolicyName(),
                policy.getHolderName(),
                policy.getStatus(),
                policy.getSDate(),
                policy.getPeriod()
        );
    }

    // Convert PolicyDto to Policy entity
    public static Policy mapToPolicy(PolicyDto policyDto) {
        return new Policy(
                policyDto.getTid(),
                policyDto.getPolicyName(),
                policyDto.getHolderName(),
                policyDto.getStatus(),
                policyDto.getSDate(),
                policyDto.getPeriod()
        );
    }
}
