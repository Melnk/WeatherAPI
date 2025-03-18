package com.example.calculator.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class WeatherEntity {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    Long id;
    String city;
    @Lob
    String weather;
    LocalDate timestamp;
}
