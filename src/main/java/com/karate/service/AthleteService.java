package com.karate.service;

import com.karate.model.Athlete;
import com.karate.repositories.AthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AthleteService {

    @Autowired
    AthleteRepository athleteRepository;

    public Athlete createAthlete(Athlete athlete){
        return this.athleteRepository.save(athlete);
    }
}
