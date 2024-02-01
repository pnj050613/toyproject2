package com.example.repository;


import com.example.entity.journey.JourneyAccommodationDTO;
import com.example.entity.journey.JourneyDTO;
import com.example.entity.journey.JourneyMoveDTO;
import com.example.entity.journey.JourneyVisitDTO;
import com.example.entity.trip.TripDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JourneyMapper {
    //여행의 이름을 입력 받아서 여행의 Id를 얻어오고, 이것의 여정 정보를 출력
    public List<JourneyDTO> journeyList(Long id);

    //여정 정보만 조회하는 것은 안 필요할듯...?(논의 필요)

    //여정 정보 등록
    public int registerJourney(Long tripId ,List<JourneyDTO> journey);

    //여정 정보 수정(수정 내용은 어떻게 할 것인지?)
    // 1. 이동 정보 수정
    public int updateJourneyMove(JourneyMoveDTO moveDTO);

    // 2. 숙박 정보 수정
    public int updateJourneyAccommodation(JourneyAccommodationDTO accommodationDTO);

    // 3. 체류 정보 수정
    public int updateJourneyVisit(JourneyVisitDTO visitDTO);

    //여행의 이름을 입력 받아서 여행의 Id를 얻어오고, 이것의 여정 정보를 삭제
    public void deleteJourney(Long tripId, Long journeyId);
}
