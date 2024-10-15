//package com.example.firstproject.service;
//
//import com.example.firstproject.dto.PolicyDto;
//
//public interface PolicyService {
//    PolicyDto createPolicy(PolicyDto policyDto);
//}

package com.example.firstproject.service;

import com.example.firstproject.dto.PolicyDto;
import java.util.List;

public interface PolicyService {
    PolicyDto createPolicy(PolicyDto policyDto);
    List<PolicyDto> getAllPolicies();
}
