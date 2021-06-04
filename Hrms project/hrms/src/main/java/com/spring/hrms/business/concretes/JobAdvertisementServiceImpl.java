package com.spring.hrms.business.concretes;

import com.spring.hrms.business.abstracts.JobAdvertisementService;
import com.spring.hrms.core.utilities.results.*;
import com.spring.hrms.dataAccess.abstracts.CityRepository;
import com.spring.hrms.dataAccess.abstracts.EmployerRepository;
import com.spring.hrms.dataAccess.abstracts.JobAdvertisementRepository;
import com.spring.hrms.dataAccess.abstracts.JobRepository;
import com.spring.hrms.entities.concretes.Job;
import com.spring.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobAdvertisementServiceImpl implements JobAdvertisementService {
    private JobAdvertisementRepository jobAdvertisementRepository;
    private EmployerRepository employerRepository;
    private CityRepository cityRepository;
    private JobRepository jobRepository;

    public JobAdvertisementServiceImpl(JobAdvertisementRepository jobAdvertisementRepository, EmployerRepository employerRepository, CityRepository cityRepository) {
        this.jobAdvertisementRepository = jobAdvertisementRepository;
        this.cityRepository = cityRepository;
        this.employerRepository = employerRepository;
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult<List<JobAdvertisement>>
                (this.jobAdvertisementRepository.getAllByActivationStatusTrue(), "All active job advertisement are listed..");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllSorted() {
        Sort sort = Sort.by(Sort.Direction.DESC, "createdDate");
        return new SuccessDataResult<List<JobAdvertisement>>
                (this.jobAdvertisementRepository.getAllByActivationStatusTrue(sort), "All active job advertisement are listed with sorting descending order.");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllByCompanyId(int id) {
        if (!this.employerRepository.existsById(id)) {
            return new ErrorDataResult<List<JobAdvertisement>>("There is no advertisement or company with entered id.");
        }

        return new SuccessDataResult<List<JobAdvertisement>>
                (this.jobAdvertisementRepository.getAllByEmployerId(id), "All job advertisement listed with entered id");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllByCompanyName(String companyName) {
        if (this.employerRepository.findAllByCompanyName(companyName).isEmpty()) {
            return new ErrorDataResult<List<JobAdvertisement>>("Invalid Company Name");
        }

        return new SuccessDataResult<List<JobAdvertisement>>
                (this.jobAdvertisementRepository.getAllByEmployer_CompanyName(companyName), "All job advertisement listed with entered company name");
    }

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {
      /*  if (!isAllFieldsFilled(jobAdvertisement)) {
            return new ErrorResult("All fields must be filled");
        }

        if (!isCityExist(jobAdvertisement)) {
            return new ErrorResult("City is not exist. Please enter valid city.");
        }

        if (!isExistEmployer(jobAdvertisement)) {
            return new ErrorResult("Employer is not exist.");
        }

        if (!isNumberOfPositionDefined(jobAdvertisement)) {
            return new ErrorResult("You must have at least 1 number of position.");
        }

        else {*/
            this.jobAdvertisementRepository.save(jobAdvertisement);
            return new SuccessResult("Successfully Added!");
        //}
    }

    @Override
    public Result activate(int id, boolean activationStatus) {
        JobAdvertisement jobAdvertisement = this.jobAdvertisementRepository.findById(id).orElse(null);

        jobAdvertisement.setActivationStatus(activationStatus);

        this.jobAdvertisementRepository.save(jobAdvertisement);
        return new SuccessResult("Activation Status is Updated");
    }


    private boolean isCityExist(JobAdvertisement jobAdvertisement) {
        if (this.cityRepository.existsById(jobAdvertisement.getCity().getId())) {
            return true;
        }

        return false;
    }


    private boolean isExistEmployer(JobAdvertisement jobAdvertisement) {
        if (this.employerRepository.existsById(jobAdvertisement.getEmployer().getId())) {
            return true;
        }

        return false;
    }


    private boolean isAllFieldsFilled(JobAdvertisement jobAdvertisement) {
        if (jobAdvertisement.getJobDescription().length() != 0 && jobAdvertisement.getLastApplyDate() != null &&
                jobAdvertisement.getPublishDate() != null) {
            return true;
        }

        return false;
    }

    private boolean isNumberOfPositionDefined(JobAdvertisement jobAdvertisement) {
        if (jobAdvertisement.getNumberOfPosition() > 0) {
            return true;
        }

        return false;
    }
}
