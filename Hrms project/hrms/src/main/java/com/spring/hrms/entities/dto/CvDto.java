package com.spring.hrms.entities.dto;

import com.spring.hrms.entities.concretes.Candidate;
import com.spring.hrms.entities.concretes.City;
import com.spring.hrms.entities.concretes.Education;
import com.spring.hrms.entities.concretes.JobExperiences;

import javax.persistence.Column;

public class CvDto {
    private int id;
    private String description;
    private String githubAddress;
    private String linkedinAddress;
    private String technologies;
    private String coverLetter;
    private Candidate candidate;
    private Education education;
    private City city;
    private JobExperiences jobExperiences;

}
