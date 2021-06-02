package com.spring.hrms.business.concretes;

import com.spring.hrms.business.abstracts.LanguageService;
import com.spring.hrms.core.utilities.results.DataResult;
import com.spring.hrms.core.utilities.results.SuccessDataResult;
import com.spring.hrms.dataAccess.abstracts.LanguageRepository;
import com.spring.hrms.entities.concretes.Language;
import org.springframework.stereotype.Service;

@Service
public class LanguageServiceImpl implements LanguageService {

    private final LanguageRepository languageRepository;

    public LanguageServiceImpl(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public DataResult<Language> add(Language language) {
        languageRepository.save(language);
        return new SuccessDataResult(language,"Language added to system.");
    }
}
