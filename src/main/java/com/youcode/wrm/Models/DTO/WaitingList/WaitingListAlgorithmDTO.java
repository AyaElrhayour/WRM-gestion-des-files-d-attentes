package com.youcode.wrm.Models.DTO.WaitingList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class WaitingListAlgorithmDTO {
    private Long id;
    private String satisfactionRate;
    private String averageWaitingTime;
    private String visitorRotation;
    private LocalDate date;
    private String algorithm;
    private Integer capacity;
    private List<?> visitingLists;
}
