package com.spring.hrms.business.abstracts;

import com.spring.hrms.core.utilities.results.DataResult;
import com.spring.hrms.entities.abstracts.ActivationCodes;
import com.spring.hrms.entities.abstracts.User;
import com.spring.hrms.entities.concretes.*;

public interface ActivationCodeService {
    DataResult activateCandidateAccountByEmail(Candidate candidate,String activationCode);
    DataResult activateEmployerAccountByEmail(Employer Employer, String activationCode);
    DataResult activateEmployerAccountByHrmsPersonal(Employer employer, Employee employee);
}
