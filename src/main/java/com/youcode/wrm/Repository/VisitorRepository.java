package com.youcode.wrm.Repository;

import com.youcode.wrm.Models.Entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VisitorRepository extends JpaRepository<Visitor, UUID> {
}
