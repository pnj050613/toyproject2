package com.example.cotroller;


import com.example.entity.trip.TripDTO;
import com.example.service.JourneyService;
import com.example.service.TripService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/trip")
public class TripController {

    @Autowired
    private TripService tripService;

    @Autowired
    private JourneyService journeyService;

    // 여행 정보 등록
    @PostMapping
    public ResponseEntity<?> registerTrip(@RequestBody TripDTO trip) {
        try {
            TripDTO savedTrip = tripService.registerTrip(trip);
            return ResponseEntity.ok().body("등록된 여행 ID: " + savedTrip.getTripId());
        } catch (Exception e) {
            log.error("여행 정보 등록 중 오류 발생", e);
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    // 2. 특정 여행의 여정 등록
    @PostMapping("/{tripId}/journeys")
    public ResponseEntity<?> registerJourneys(@PathVariable Long tripId, @RequestBody List<JourneyDTO> journeys) {
        try {
            int registeredCount = journeyService.registerJourney(tripId, journeys);
            return ResponseEntity.ok().body("등록된 여정 개수: " + registeredCount);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    // 3.여행조회
    // 3-1. 여행 전체 조회

    // 3-2. 여행 ID를 urlparameter로 받아서 여행과 여정 조회

    // 4. 여행 정보 수정
    @PostMapping("/update")
    public void tripUpdate(
            @RequestBody TripDTO trip
    ){
        tripService.tripUpdate(trip);
    }
    // 5. 여정 정보 수정

}
