package com.youcode.wrm.Models.DTO.VisitingList;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VisitingListDTO {

    private Long visitorId;
    private Long waitingListId;
    private LocalDateTime arrivalTime;
    private LocalTime startTime;
    private LocalTime endTime;
}
