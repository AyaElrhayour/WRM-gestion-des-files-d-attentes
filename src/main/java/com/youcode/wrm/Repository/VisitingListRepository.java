package com.youcode.wrm.Repository;

import com.youcode.wrm.Models.Entity.VisitingList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface VisitingListRepository extends JpaRepository<VisitingList , UUID> {
    List<VisitingListRepository> findALlByOrderByArrivalTime();
}
