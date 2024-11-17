package com.youcode.wrm.Mapper;


import com.youcode.wrm.Models.DTO.VisitingList.VisitingListDTO;
import com.youcode.wrm.Models.DTO.VisitingList.VisitorFifoDTO;
import com.youcode.wrm.Models.DTO.VisitingList.VisitorHpfDTO;
import com.youcode.wrm.Models.DTO.VisitingList.VisitorSjfDTO;
import com.youcode.wrm.Models.Entity.VisitingList;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VisitingListMapper {

    VisitingListDTO toVisitingListDTO(VisitingList visitingList);
    VisitorFifoDTO toVisitorFifoDTO(VisitingList visitingList);
    VisitorSjfDTO toVisitorSjfDTO(VisitingList visitingList);
    VisitorHpfDTO toVisitorHpfDTO(VisitingList visitingList);
    VisitingList toVisitingList(VisitingListDTO visitingListDTO);
}
