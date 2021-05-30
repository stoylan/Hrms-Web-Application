package com.spring.hrms.adapter.concretes;

import com.spring.hrms.adapter.abstracts.ServiceAdapter;
import com.spring.hrms.core.utilities.mernisService.RMFKPSPublicSoap;
import com.spring.hrms.entities.concretes.Candidate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;

@Service
public class MernisServiceAdapter implements ServiceAdapter {
    @Override
    public boolean checkIfRealPerson(Candidate candidate) throws Exception {
        RMFKPSPublicSoap client = new RMFKPSPublicSoap();
        LocalDate localDate = candidate.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year  = localDate.getYear();

        return client.TCKimlikNoDogrula(Long.valueOf(candidate.getNationalityNumber()),candidate.getFirstName().toUpperCase(),candidate.getLastName().toUpperCase(),year);
    }
}
