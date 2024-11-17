package com.youcode.wrm.Repository;

import com.youcode.wrm.Models.Entity.WaitingList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WaitingListRepository extends JpaRepository<WaitingList, UUID> {
}
