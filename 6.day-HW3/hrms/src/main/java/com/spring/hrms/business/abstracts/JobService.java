package com.spring.hrms.business.abstracts;

import com.spring.hrms.entities.concretes.Job;

import java.util.List;

public interface JobService {
    List<Job> getAll();
}
