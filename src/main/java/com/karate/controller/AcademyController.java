package com.karate.controller;


import com.karate.model.Academy;
import com.karate.service.AcademyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/academy")
public class AcademyController {

    @Autowired
    AcademyService academyService;

    @PostMapping("/")
    public ResponseEntity<Object> create(@RequestBody  Academy academy){
        try {
            var result = this.academyService.createAcademy(academy);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
