package com.youcode.wrm.Service.Implementation;

import com.youcode.wrm.Helpers.Algorithm;
import com.youcode.wrm.Models.DTO.VisitingList.VisitingListDTO;
import com.youcode.wrm.Models.Entity.VisitingList;
import com.youcode.wrm.Repository.VisitingListRepository;
import com.youcode.wrm.Service.Interface.VisitingListSIN;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VisitingListSIM implements VisitingListSIN {

    private VisitingListRepository visitingListRepository;
    private Algorithm algorithm;

    @Override
    public List<VisitingListDTO> getAllVisitingLists() {
        return List.of();
    }
}
