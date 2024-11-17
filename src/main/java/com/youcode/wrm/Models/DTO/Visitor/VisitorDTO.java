package com.youcode.wrm.Models.DTO.Visitor;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VisitorDTO {

    private UUID id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;
}
