package com.spring.hrms.api.controller;

import com.spring.hrms.business.abstracts.CandidateRegisterService;
import com.spring.hrms.business.abstracts.CandidateService;
import com.spring.hrms.core.utilities.results.DataResult;
import com.spring.hrms.core.utilities.results.Result;
import com.spring.hrms.entities.concretes.Candidate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {
    private final CandidateService candidateService;
    private final CandidateRegisterService candidateRegisterService;

    public CandidateController(CandidateService candidateService, CandidateRegisterService candidateRegisterService) {
        this.candidateService = candidateService;
        this.candidateRegisterService = candidateRegisterService;
    }

    @GetMapping("/getall")
    public DataResult getAll(){
        return candidateService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Candidate candidate) throws Exception {
        return candidateRegisterService.register(candidate);
    }

}
