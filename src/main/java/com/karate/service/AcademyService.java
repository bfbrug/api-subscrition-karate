package com.karate.service;

import com.karate.model.Academy;
import com.karate.repositories.AcademyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcademyService {

    @Autowired
    AcademyRepository academyRepository;

    public Academy createAcademy(Academy academy){
        return this.academyRepository.save(academy);

    }
}
