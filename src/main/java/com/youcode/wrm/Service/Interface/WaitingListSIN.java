package com.youcode.wrm.Service.Interface;

import com.youcode.wrm.Models.DTO.WaitingList.WaitingListAlgorithmDTO;
import com.youcode.wrm.Models.DTO.WaitingList.WaitingListDTO;

import java.util.List;

public interface WaitingListSIN {

    WaitingListDTO createWaitingList(WaitingListDTO waitingListDTO);
    List<WaitingListAlgorithmDTO> getWaitingLists();
}
