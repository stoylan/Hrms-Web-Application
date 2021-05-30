package com.spring.hrms.api.controller;

import com.spring.hrms.business.abstracts.JobAdvertisementService;
import com.spring.hrms.core.utilities.results.DataResult;
import com.spring.hrms.core.utilities.results.Result;
import com.spring.hrms.entities.concretes.JobAdvertisement;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementController {

    private final JobAdvertisementService jobAdvertisementService;

    public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }

    @GetMapping("/getAll")
    DataResult<List<JobAdvertisement>> getAll() {
        return this.jobAdvertisementService.getAll();
    }

    @GetMapping("/getAllSorted")
    DataResult<List<JobAdvertisement>> getAllSorted() {
        return this.jobAdvertisementService.getAllSorted();
    }

    @PostMapping("/getAllByCompanyName")
    DataResult<List<JobAdvertisement>> getAllByCompanyName(@RequestParam String companyName) {
        return this.jobAdvertisementService.getAllByCompanyName(companyName);
    }

    @PostMapping("/getAllByCompanyId")
    DataResult<List<JobAdvertisement>> getAllByCompanyId(@RequestParam int id) {
        return this.jobAdvertisementService.getAllByCompanyId(id);
    }

    @PutMapping("/activate")
    Result activate(@RequestParam("id") int id, @RequestParam("activationStatus") boolean activationStatus) {
        return this.jobAdvertisementService.activate(id, activationStatus);
    }

    @PostMapping("/add")
    Result add(@RequestBody JobAdvertisement jobAdvertisement) {
        return this.jobAdvertisementService.add(jobAdvertisement);
    }
}
