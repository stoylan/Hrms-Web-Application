package com.spring.hrms.api.controller;

import com.spring.hrms.business.abstracts.JobService;
import com.spring.hrms.entities.concretes.Job;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/getall")
    public List<Job> getAll(){
        return jobService.getAll();

    }
}
