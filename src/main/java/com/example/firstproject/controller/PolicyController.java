//////package com.example.firstproject.controller;
//////
//////import com.example.firstproject.dto.PolicyDto;
//////import com.example.firstproject.service.PolicyService;
//////import lombok.AllArgsConstructor;
//////import org.apache.coyote.Response;
//////import org.springframework.http.HttpStatus;
//////import org.springframework.http.ResponseEntity;
//////import org.springframework.web.bind.annotation.PostMapping;
//////import org.springframework.web.bind.annotation.RequestBody;
//////import org.springframework.web.bind.annotation.RequestMapping;
//////import org.springframework.web.bind.annotation.RestController;
//////
//////@RestController
//////@AllArgsConstructor
//////@RequestMapping("/api/policies")
//////public class PolicyController {
//////    private PolicyService policyService;
//////    @PostMapping
//////    public ResponseEntity<PolicyDto> createPolicy(@RequestBody PolicyDto policyDto){
//////        PolicyDto savedPolicy = policyService.createPolicy(policyDto);
//////        return new ResponseEntity<>(savedPolicy, HttpStatus.CREATED);
//////    }
//////
//////
//////}
////
////
////
////package com.example.firstproject.controller;
////
////import com.example.firstproject.dto.PolicyDto;
////import com.example.firstproject.service.PolicyService;
////import lombok.AllArgsConstructor;
////import org.springframework.http.HttpStatus;
////import org.springframework.http.ResponseEntity;
////import org.springframework.web.bind.annotation.GetMapping;
////import org.springframework.web.bind.annotation.PostMapping;
////import org.springframework.web.bind.annotation.RequestBody;
////import org.springframework.web.bind.annotation.RequestMapping;
////import org.springframework.web.bind.annotation.RestController;
////
////import java.util.List;
////
////@RestController
////@AllArgsConstructor
////@RequestMapping("/api/policies")
////public class PolicyController {
////    private final PolicyService policyService;
////
////    @PostMapping
////    public ResponseEntity<PolicyDto> createPolicy(@RequestBody PolicyDto policyDto) {
////        PolicyDto savedPolicy = policyService.createPolicy(policyDto);
////        return new ResponseEntity<>(savedPolicy, HttpStatus.CREATED);
////    }
////
////    // New endpoint to fetch all policies
////    @GetMapping
////    public ResponseEntity<List<PolicyDto>> getAllPolicies() {
////        List<PolicyDto> policies = policyService.getAllPolicies();
////        return new ResponseEntity<>(policies, HttpStatus.OK);
////    }
////}
//
//package com.example.firstproject.controller;
//
//import com.example.firstproject.dto.PolicyDto;
//import com.example.firstproject.service.PolicyService;
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@AllArgsConstructor
//@RequestMapping("/api/policies")
//@CrossOrigin(origins = "http://localhost:5173") // Enable CORS for this specific endpoint
//public class PolicyController {
//    private final PolicyService policyService;
//
//    @PostMapping
//    public ResponseEntity<PolicyDto> createPolicy(@RequestBody PolicyDto policyDto) {
//        PolicyDto savedPolicy = policyService.createPolicy(policyDto);
//        return new ResponseEntity<>(savedPolicy, HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<PolicyDto>> getAllPolicies() {
//        List<PolicyDto> policies = policyService.getAllPolicies();
//        return new ResponseEntity<>(policies, HttpStatus.OK);
//    }
//}

package com.example.firstproject.controller;

import com.example.firstproject.dto.PolicyDto;
import com.example.firstproject.service.PolicyService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/policies")
@CrossOrigin(origins = "http://localhost:5173") // Enable CORS for this specific endpoint
public class PolicyController {
    private final PolicyService policyService;

    @PostMapping
    public ResponseEntity<PolicyDto> createPolicy(@RequestBody PolicyDto policyDto) {
        PolicyDto savedPolicy = policyService.createPolicy(policyDto);
        return new ResponseEntity<>(savedPolicy, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PolicyDto>> getAllPolicies() {
        List<PolicyDto> policies = policyService.getAllPolicies();
        return new ResponseEntity<>(policies, HttpStatus.OK);
    }
}
