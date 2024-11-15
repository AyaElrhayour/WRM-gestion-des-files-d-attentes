package com.youcode.wrm.Modles.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "waitingList")
public class WaitingList {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "algorithm")
    private String algorithm;

    @Column(name = "capacity")
    private Integer capacity;

    @OneToMany(mappedBy = "waitingList" , fetch = FetchType.EAGER)
    private Set<VisitingList> visitingLists;
}
