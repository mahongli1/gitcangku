package com.mhl.jcartadministrationback.controller;

import com.mhl.jcartadministrationback.dto.out.ReturnShowOutDTO;
import com.mhl.jcartadministrationback.dto.in.ReturnSearchInDTO;
import com.mhl.jcartadministrationback.dto.in.ReturnUpdateActionInDTO;
import com.mhl.jcartadministrationback.dto.out.PageOutDTO;
import com.mhl.jcartadministrationback.dto.out.ReturnListOutDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 14:38
 */
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
