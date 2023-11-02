package com.karate.DTO;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class AcademyDTO {

    private String id;
    private String name;
    private String city;
    private String responsibleSensei;
    private LocalDate createdAt;
    private LocalDate updatedAt;

}
