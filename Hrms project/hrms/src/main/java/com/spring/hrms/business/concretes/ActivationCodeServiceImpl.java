package com.spring.hrms.business.concretes;

import com.spring.hrms.business.abstracts.ActivationCodeService;
import com.spring.hrms.core.utilities.results.DataResult;
import com.spring.hrms.core.utilities.results.SuccessDataResult;
import com.spring.hrms.dataAccess.abstracts.*;
import com.spring.hrms.entities.abstracts.User;
import com.spring.hrms.entities.concretes.*;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ActivationCodeServiceImpl implements ActivationCodeService {

    private final ActivationCodeCandidateRepository activationCodeCandidateRepository;
    private final ActivationCodeEmployerRepository activationCodeEmployerRepository;
    private final EmployerActivationByEmployeeRepository employerActivationByEmployeeRepository;

    public ActivationCodeServiceImpl(ActivationCodeCandidateRepository activationCodeCandidateRepository, ActivationCodeEmployerRepository activationCodeEmployerRepository, EmployerActivationByEmployeeRepository employerActivationByEmployeeRepository) {
        this.activationCodeCandidateRepository = activationCodeCandidateRepository;
        this.activationCodeEmployerRepository = activationCodeEmployerRepository;
        this.employerActivationByEmployeeRepository = employerActivationByEmployeeRepository;
    }


    @Override
    public DataResult activateCandidateAccountByEmail(Candidate candidate,String activationCode) {
        ActivationCodeCandidate activationCodes = new ActivationCodeCandidate();
        activationCodes.setCandidateId(candidate.getId());
        activationCodes.setConfirmed(true);
        activationCodes.setConfirmedDate(new Date());
        activationCodes.setActivationCode(activationCode);
        //activationCodeCandidateRepository.save(activationCodes);
        return new SuccessDataResult(candidate,"Have been verified by e-mail succesfuly");
    }

    @Override
    public DataResult activateEmployerAccountByEmail(Employer Employer, String activationCode) {

        ActivationCodeEmployer activationCodes = new ActivationCodeEmployer();
        activationCodes.setEmployerId(Employer.getId());
        activationCodes.setConfirmed(true);
        activationCodes.setConfirmedDate(new Date());
        activationCodes.setActivationCode(activationCode);
       //activationCodeEmployerRepository.save(activationCodes);
        return new SuccessDataResult(Employer,"Has been verified by e-mail succesfuly");
    }

    @Override
    public DataResult activateEmployerAccountByHrmsPersonal(Employer employer,Employee employee){
        EmployerActivationByEmployee employerActivationByEmployee = new EmployerActivationByEmployee();
        employerActivationByEmployee.setConfirmed(true);
        employerActivationByEmployee.setConfirmedDate(new Date());
        employerActivationByEmployee.setEmployeeId(employee.getId());
        employerActivationByEmployee.setEmployerId(employer.getId());
       // employerActivationByEmployeeRepository.save(employerActivationByEmployee);
        return new SuccessDataResult(employer,"Has been verified by hrms personal.");

    }
}
