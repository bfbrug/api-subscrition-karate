package com.karate.mappers;

import com.karate.DTO.AthleteDTO;
import com.karate.model.Athlete;
import org.mapstruct.Mapper;

@Mapper
public interface AthleteMapper {

    Athlete atlheteDtoToAthlete(AthleteDTO dto);

    AthleteDTO atheleToAthleteDto(Athlete athlete);
}
