package com.youcode.wrm.Models.DTO.WaitingList;


import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WaitingListDTO {

    @Id
    @UuidGenerator
    private UUID id;

    @NotNull
    private LocalDate date;
    private String algorithm;
    private Integer capacity;
}
