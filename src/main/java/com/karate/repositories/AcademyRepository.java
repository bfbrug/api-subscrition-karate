package com.karate.repositories;

import com.karate.model.Academy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AcademyRepository extends JpaRepository<Academy, UUID> {
}
