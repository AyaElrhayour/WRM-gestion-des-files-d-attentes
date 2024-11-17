package com.youcode.wrm.Mapper;

import com.youcode.wrm.Models.DTO.WaitingList.WaitingListAlgorithmDTO;
import com.youcode.wrm.Models.DTO.WaitingList.WaitingListDTO;
import com.youcode.wrm.Models.Entity.WaitingList;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WaitingListMapper {

    WaitingList toWaitingList(WaitingListDTO waitingListDTO);
    WaitingListDTO toWaitingListDTO(WaitingList waitingList);
    WaitingListAlgorithmDTO toWaitingListAgorithm(WaitingList waitingList);
}
