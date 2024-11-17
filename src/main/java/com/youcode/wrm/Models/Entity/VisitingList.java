package com.youcode.wrm.Models.Entity;


import com.youcode.wrm.Models.Entity.Embd.EmbedableId;
import com.youcode.wrm.Models.Enum.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "vistingList")
public class VisitingList implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private EmbedableId embedableId;

    @Column(name = "arrivalTime")
    private LocalDateTime arrivalTime;

    @Column(name = "startTime")
    private LocalTime startTime;

    @Column(name = "endTime")
    private LocalTime endTime;

    @Column(name = "status")
    private Status status;

    @Column(name = "estimatedTime")
    private Integer estimatedTime;

    @Column(name = "priority")
    private Integer priority;

    @ManyToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    @MapsId("visitorId")
    private Visitor visitor;

    @ManyToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    @MapsId("waitingListId")
    private WaitingList waitingList;
}
