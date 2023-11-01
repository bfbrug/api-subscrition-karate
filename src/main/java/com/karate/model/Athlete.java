package com.karate.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
public class Athlete {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String email;
    private String city;
    private String password;
    private LocalDateTime birth;
    private Float weigth;

    @Enumerated(EnumType.STRING)
    private Kiu kiu;

    @CreationTimestamp
    private LocalDateTime createdAt;


}
