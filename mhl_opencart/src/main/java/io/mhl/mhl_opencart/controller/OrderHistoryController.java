package io.mhl.mhl_opencart.controller;

import io.mhl.mhl_opencart.dto.in.OrderHistoryCreateInDTO;
import io.mhl.mhl_opencart.dto.out.OrderHistoryListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/orderhistory")
public class OrderHistoryController {


    @GetMapping("/getListByOrderId")
    public List<OrderHistoryListOutDTO> getListByOrderId(@RequestParam Long orderId){
        return null;
    }


    @PostMapping("/create")
    public Integer create(@RequestBody OrderHistoryCreateInDTO orderHistoryCreateInDTO){
        return null;
    }
}
