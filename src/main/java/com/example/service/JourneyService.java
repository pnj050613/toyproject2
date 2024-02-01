package com.example.service;

import com.example.entity.journey.JourneyAccommodationDTO;
import com.example.entity.journey.JourneyDTO;
import com.example.entity.journey.JourneyMoveDTO;
import com.example.entity.journey.JourneyVisitDTO;
import com.example.repository.JourneyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JourneyService {

    @Autowired
    private JourneyMapper journeyMapper;

    public List<JourneyDTO> journeyList(Long id){
        return journeyMapper.journeyList(id);
    }

    public int registerJourney(Long tripId ,List<JourneyDTO> journey){
        return journeyMapper.registerJourney(tripId, journey);
    }

    public void deleteJourney(Long tripId, Long journeyId){
        journeyMapper.deleteJourney(tripId, journeyId);
    }


    public int updateJourneyMove(JourneyMoveDTO moveDTO){
        return journeyMapper.updateJourneyMove(moveDTO);
    }


    public int updateJourneyAccommodation(JourneyAccommodationDTO accommodationDTO){
        return journeyMapper.updateJourneyAccommodation(accommodationDTO);
    }


    public int updateJourneyVisit(JourneyVisitDTO visitDTO){
        return journeyMapper.updateJourneyVisit(visitDTO);
    }


}
