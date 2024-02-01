package com.example.entity.journey;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class JourneyMoveDTO {
    private Long journeyId;
    private String departure;
    private String arrival;
    private LocalDate departDate;
    private LocalDate arriveDate;

}
