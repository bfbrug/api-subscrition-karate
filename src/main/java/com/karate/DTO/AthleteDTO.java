package com.karate.DTO;

import com.karate.model.Academy;
import com.karate.model.Kiu;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Builder
@Data
public class AthleteDTO {
    private String id;
    private String name;
    private String email;
    private String password;
    private LocalDate birth;
    private Float weigth;
    private Academy academy;
    private UUID academyId;
    private Kiu kiu;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
