package io.mhl.mhl_opencart.controller;

import io.mhl.mhl_opencart.dto.in.ReturnSearchInDTO;
import io.mhl.mhl_opencart.dto.in.ReturnUpdateActionInDTO;
import io.mhl.mhl_opencart.dto.out.PageOutDTO;
import io.mhl.mhl_opencart.dto.out.ReturnListOutDTO;
import io.mhl.mhl_opencart.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {
    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }


    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }
}
