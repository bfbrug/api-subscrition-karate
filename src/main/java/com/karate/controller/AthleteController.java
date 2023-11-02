package com.karate.controller;

import com.karate.model.Athlete;
import com.karate.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/athlete")
public class AthleteController {

    @Autowired
    AthleteService athleteService;

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Athlete athlete){
        try{
            var result = this.athleteService.createAthlete(athlete);

            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
