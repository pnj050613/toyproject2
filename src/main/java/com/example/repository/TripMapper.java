package com.example.repository;

import com.example.entity.trip.TripDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripMapper {
    //여행 정보 출력
    public List<TripDTO> tripList();

    //url파라미터로 받아서 여행 정보 출력 하는 부분(여정도 출력해야함.)
    public List<TripDTO> findById(Long id);

    //여행 정보 등록
    public int registerTrip(List<TripDTO> trip);

    //여행 정보 수정(수정 내용은 어떻게 할 것인지?)
    public void updateTrip(TripDTO trip);

    //삭제(여정 정보도 같이 삭제 되어야 함.)
    public void deleteTrip(int tripId);
}
