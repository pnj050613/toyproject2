package com.example.entity.trip;


import com.example.entity.journey.JourneyDTO;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TripDTO {
    private Long tripId;
    private String name;
    private boolean isDomestic;
    private String destination;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<JourneyDTO> journies;
}
