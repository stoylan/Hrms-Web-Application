package com.spring.hrms.business.concretes;

import com.spring.hrms.business.abstracts.JobService;
import com.spring.hrms.dataAccess.abstracts.JobRepository;
import com.spring.hrms.entities.concretes.Job;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    private final JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }


    @Override
    public List<Job> getAll() {
        return jobRepository.findAll();
    }
}
