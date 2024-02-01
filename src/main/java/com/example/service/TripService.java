package com.example.service;

import com.example.entity.trip.TripDTO;
import com.example.repository.TripMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TripService {

    @Autowired
    private TripMapper mapper;

    public List<TripDTO> tripList(){
        return mapper.tripList();
    }

    public List<TripDTO> findById(Long id){
        return mapper.findById(id);
    }

    public int insertTrip(List<TripDTO> trip){return mapper.registerTrip(trip);}

    public void tripUpdate(TripDTO trip){ mapper.updateTrip(trip); }

    public void deleteTrip(int tripId){
        mapper.deleteTrip(tripId);
    }

}
