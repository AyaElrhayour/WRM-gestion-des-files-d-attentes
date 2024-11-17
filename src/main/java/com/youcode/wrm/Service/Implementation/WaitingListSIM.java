package com.youcode.wrm.Service.Implementation;

import com.youcode.wrm.Helpers.Algorithm;
import com.youcode.wrm.Helpers.WaitingListProperties;
import com.youcode.wrm.Mapper.WaitingListMapper;
import com.youcode.wrm.Models.DTO.WaitingList.WaitingListAlgorithmDTO;
import com.youcode.wrm.Models.DTO.WaitingList.WaitingListDTO;
import com.youcode.wrm.Models.Entity.WaitingList;
import com.youcode.wrm.Repository.WaitingListRepository;
import com.youcode.wrm.Service.Interface.WaitingListSIN;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WaitingListSIM implements WaitingListSIN {

    private final WaitingListRepository waitingListRepository;
    private final WaitingListMapper waitingListMapper;
    private final WaitingListProperties waitingListProperties;
    private final Algorithm algorithm;


    @Override
    public WaitingListDTO createWaitingList(WaitingListDTO waitingListDTO) {
        if (waitingListDTO.getAlgorithm() == null){
            waitingListDTO.setAlgorithm(waitingListProperties.getAlgorithm());
        }

        if (waitingListDTO.getCapacity() == null){
            waitingListDTO.setCapacity(waitingListProperties.getCapacity());
        }

        WaitingList waitingList = waitingListMapper.toWaitingList(waitingListDTO);

        WaitingList waitingListSaved = waitingListRepository.save(waitingList);
        return waitingListMapper.toWaitingListDTO(waitingListSaved);
    }

    @Override
    public List<WaitingListAlgorithmDTO> getWaitingLists() {
        return waitingListRepository.findAll().stream().map(waitingList -> {WaitingListAlgorithmDTO waitingListResponse =waitingListMapper.toWaitingListAgorithm(waitingList);
            List<?> visitingList = algorithm.checkAlgorithm(waitingList);
            waitingListResponse.setVisitingLists(visitingList);
            return waitingListResponse;
        }).toList();
    }
}
