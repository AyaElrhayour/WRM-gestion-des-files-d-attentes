package com.youcode.wrm.Helpers;

import com.youcode.wrm.Mapper.VisitingListMapper;
import com.youcode.wrm.Models.DTO.VisitingList.VisitorFifoDTO;
import com.youcode.wrm.Models.DTO.VisitingList.VisitorHpfDTO;
import com.youcode.wrm.Models.DTO.VisitingList.VisitorSjfDTO;
import com.youcode.wrm.Models.Entity.VisitingList;
import com.youcode.wrm.Models.Entity.WaitingList;
import com.youcode.wrm.Repository.VisitingListRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Component
@AllArgsConstructor
public class Algorithm {

    private final VisitingListRepository visitingListRepository;
    private final VisitingListMapper visitingListMapper;

    public List<VisitorFifoDTO> FIFO(List<VisitingList> visitingList) {
        if (visitingList == null) {
            visitingList = new ArrayList<>();
        }
        return visitingList.stream().sorted(Comparator.comparing(VisitingList::getArrivalTime)).map(visitingListMapper::toVisitorFifoDTO).toList();
    }

    public List<VisitorHpfDTO> HPF(List<VisitingList> visitingList) {
        if (visitingList == null) {
            visitingList = new ArrayList<>();
        }
        return visitingList.stream().sorted(Comparator.comparingInt(VisitingList::getPriority).thenComparing(VisitingList::getArrivalTime)).map(visitingListMapper::toVisitorHpfDTO).toList();
    }

    public List<VisitorSjfDTO> SJF(List<VisitingList> visitingList) {
        if (visitingList == null) {
            visitingList =new ArrayList<>();
        }
        return visitingList.stream().sorted(Comparator.comparingInt(VisitingList::getEstimatedTime)).map(visitingListMapper::toVisitorSjfDTO).toList();

    }

    public List<?> checkAlgorithm(WaitingList waitingList) {
        switch (waitingList.getAlgorithm()){
            case "FIFO" :
                List<VisitorFifoDTO> FifoList = this.FIFO(waitingList.getVisitingLists());
                return FifoList;
            case "HPF" :
                List<VisitorHpfDTO> HpfList = this.HPF(waitingList.getVisitingLists());
                return HpfList;
            case "SJF" :
                List<VisitorSjfDTO> SjfList = this.SJF(waitingList.getVisitingLists());
                return SjfList;
            default:
                return new ArrayList<>();
        }
    }
}
