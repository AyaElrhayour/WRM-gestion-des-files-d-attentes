package com.youcode.wrm.Controller;

import com.youcode.wrm.Models.DTO.WaitingList.WaitingListAlgorithmDTO;
import com.youcode.wrm.Models.DTO.WaitingList.WaitingListDTO;
import com.youcode.wrm.Service.Interface.WaitingListSIN;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/waitingList")
@Validated
@AllArgsConstructor
public class WaitingListController {

    private final WaitingListSIN waitingListSIN;

    @PostMapping
    public WaitingListDTO createWaitingList(@Valid @RequestBody WaitingListDTO waitingListDTO) {
        return waitingListSIN.createWaitingList(waitingListDTO);
    }

    @GetMapping
    public List<WaitingListAlgorithmDTO> getWaitingLists() {
        return waitingListSIN.getWaitingLists();
    }

}
