package com.youcode.wrm.Modles.DTO.VisitingList;


import com.youcode.wrm.Modles.DTO.Visitor.VisitorDTO;
import com.youcode.wrm.Modles.Enum.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VistorHpfDTO {

    private VisitorDTO visitor;
    private LocalDateTime arrivalTime;
    private LocalTime startTime;
    private LocalTime endTime;
    private Status status;
    private Integer priority;

}
