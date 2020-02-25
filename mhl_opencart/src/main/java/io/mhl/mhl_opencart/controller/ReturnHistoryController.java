package io.mhl.mhl_opencart.controller;

import io.mhl.mhl_opencart.dto.in.ReturnHistoryCreateInDTO;
import io.mhl.mhl_opencart.dto.out.ReturnHistoryListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/returnhistory")
public class ReturnHistoryController {

    @GetMapping("/getListByReturnId")
    public List<ReturnHistoryListOutDTO> getListByReturnId(@RequestParam Integer returnId){
        return null;
    }


    @PostMapping("/create")
    public Integer create(@RequestBody ReturnHistoryCreateInDTO returnHistoryInDTO){
        return null;
    }

}
