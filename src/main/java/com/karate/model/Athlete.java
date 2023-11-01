package com.karate.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Setter
@Builder
@Entity
public class Athlete {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String email;
    private String password;
    private LocalDateTime birth;
    private Float weigth;

    @ManyToOne
    @JoinColumn(name = "academy_id", insertable = false, updatable = false)
    private Academy academy;

    @Column(name = "academy_id", nullable = false)
    private UUID academyId;

    @Enumerated(EnumType.STRING)
    private Kiu kiu;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;


}
