package com.youcode.wrm.Models.DTO.VisitingList;


import com.youcode.wrm.Models.DTO.Visitor.VisitorDTO;
import com.youcode.wrm.Models.Enum.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VisitorSjfDTO {

    private VisitorDTO visitor;
    private LocalDateTime arrivalTime;
    private LocalTime startTime;
    private LocalTime endTime;
    private Status status;
    private Integer estimatedTime;
}
