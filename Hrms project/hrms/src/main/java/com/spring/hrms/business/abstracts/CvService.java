package com.spring.hrms.business.abstracts;

import com.spring.hrms.core.utilities.results.DataResult;
import com.spring.hrms.entities.concretes.Cv;

public interface CvService {
    DataResult<Cv> add(int candidateId, Cv cv);

    DataResult<Cv> getByCandidate_Id(int id);
}
