package com.mhl.jcartadministrationback.controller;

import com.mhl.jcartadministrationback.dto.in.ReturnHistoryCreateInDTO;
import com.mhl.jcartadministrationback.dto.out.ReturnHistoryListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 14:56
 */
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