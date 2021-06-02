package com.spring.hrms.business.concretes;

import com.spring.hrms.business.abstracts.CvService;
import com.spring.hrms.core.utilities.results.DataResult;
import com.spring.hrms.core.utilities.results.SuccessDataResult;
import com.spring.hrms.dataAccess.abstracts.CandidateRepository;
import com.spring.hrms.dataAccess.abstracts.CvRepository;
import com.spring.hrms.entities.concretes.Candidate;
import com.spring.hrms.entities.concretes.Cv;
import org.springframework.stereotype.Service;

@Service
public class CvServiceImpl implements CvService {

    private final CvRepository cvRepository;
    private final CandidateRepository candidateRepository;

    public CvServiceImpl(CvRepository cvRepository,CandidateRepository candidateRepository) {
        this.cvRepository = cvRepository;
        this.candidateRepository = candidateRepository;
    }

    @Override
    public DataResult<Cv> add(int candidateId, Cv cv) {
        Candidate candidate = candidateRepository.findById(candidateId).get();
        candidate.setCv(cv);
        //candidateRepository.save(candidate);
        cv.setCandidate(candidate);
        cvRepository.save(cv);
        return new SuccessDataResult(cv,"Succesfuly added CV to system.");
    }

    @Override
    public DataResult<Cv> getByCandidate_Id(int id) {
        return new SuccessDataResult(cvRepository.getByCandidate_Id(id));
    }
}
