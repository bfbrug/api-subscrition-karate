package com.karate.mappers;

import com.karate.DTO.AcademyDTO;
import com.karate.model.Academy;
import org.mapstruct.Mapper;

@Mapper
public interface AcademyMapper {

    Academy academyDtoToAcademy(AcademyDTO dto);

    AcademyDTO academyToAcademyDto(Academy academy);
}
