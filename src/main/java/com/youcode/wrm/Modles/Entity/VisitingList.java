package com.youcode.wrm.Modles.Entity;


import com.youcode.wrm.Modles.Entity.Embd.EmbedableId;
import com.youcode.wrm.Modles.Enum.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "vistingList")
public class VisitingList {

    @EmbeddedId
    private EmbedableId embedableId;

    @Column(name = "arrivalTime")
    private LocalDateTime arrivalTime;

    @Column(name = "startTime")
    private LocalDateTime startTime;

    @Column(name = "endTime")
    private LocalDateTime endTime;

    @Column(name = "status")
    private Status status;

    @Column(name = "estimatedTime")
    private Integer estimatedTime;

    @Column(name = "priority")
    private Integer priority;

    @ManyToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    @MapsId("visitor_id")
    private Visitor visitor;

    @MapsId("waitinglist_id")
    @ManyToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    private WaitingList waitingList;


}
