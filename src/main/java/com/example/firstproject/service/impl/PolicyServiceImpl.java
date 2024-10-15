//package com.example.firstproject.service.impl;
//import com.example.firstproject.dto.PolicyDto;
//import com.example.firstproject.entity.Policy;
//import com.example.firstproject.mapper.PolicyMapper;
//import com.example.firstproject.repository.PolicyRepository;
//import com.example.firstproject.service.PolicyService;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//@Service
//@AllArgsConstructor
//public class PolicyServiceImpl implements PolicyService {
//
//    private PolicyRepository policyRepository;
//    @Override
//    public PolicyDto createPolicy(PolicyDto policyDto) {
////        Policy policy = PolicyMapper.mapToPolicy(policyDto);
////        Policy savedPolicy = policyRepository.save(policy);
////        return PolicyMapper.mapToPolicyDto(savedPolicy);
//        Policy policy = PolicyMapper.mapToPolicy(policyDto);
//        Policy savedPolicy = policyRepository.save(policy);
//        return PolicyMapper.mapToPolicyDto(savedPolicy);
//    }
//}

package com.example.firstproject.service.impl;

import com.example.firstproject.dto.PolicyDto;
import com.example.firstproject.entity.Policy;
import com.example.firstproject.repository.PolicyRepository;
import com.example.firstproject.service.PolicyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PolicyServiceImpl implements PolicyService {
    private final PolicyRepository policyRepository;

    @Override
    public PolicyDto createPolicy(PolicyDto policyDto) {
        Policy policy = new Policy(
                policyDto.getTid(),
                policyDto.getPolicyName(),
                policyDto.getHolderName(),
                policyDto.getStatus(),
                policyDto.getSDate(),
                policyDto.getPeriod()
        );
        Policy savedPolicy = policyRepository.save(policy);
        return new PolicyDto(
                savedPolicy.getTid(),
                savedPolicy.getPolicyName(),
                savedPolicy.getHolderName(),
                savedPolicy.getStatus(),
                savedPolicy.getSDate(),
                savedPolicy.getPeriod()
        );
    }

    @Override
    public List<PolicyDto> getAllPolicies() {
        List<Policy> policies = policyRepository.findAll();
        return policies.stream().map(policy -> new PolicyDto(
                policy.getTid(),
                policy.getPolicyName(),
                policy.getHolderName(),
                policy.getStatus(),
                policy.getSDate(),
                policy.getPeriod()
        )).collect(Collectors.toList());
    }
}
