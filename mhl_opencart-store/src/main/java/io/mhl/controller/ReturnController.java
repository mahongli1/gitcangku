package io.mhl.controller;

import io.mhl.dto.in.ReturnApplyInDTO;
import io.mhl.dto.out.PageOutDTO;
import io.mhl.dto.out.ReturnListOutDTO;
import io.mhl.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @PostMapping("/apply")
    public Integer apply(@RequestBody ReturnApplyInDTO returnApplyInDTO) {
        return null;
    }

    @GetMapping("/getReturnByCustomerId")
    public PageOutDTO<ReturnListOutDTO> getReturnByCustomerId(@RequestParam Integer pageNum,
                                                              @RequestParam Integer customerId) {
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId) {
        return null;
    }


}