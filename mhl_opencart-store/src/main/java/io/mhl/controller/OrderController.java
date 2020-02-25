package io.mhl.controller;

import io.mhl.dto.in.OrderProductInDTO;
import io.mhl.dto.out.OrderListOutDTO;
import io.mhl.dto.out.OrderShowOutDTO;
import io.mhl.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {


    @PostMapping("/checkout")
    public Integer checkout(List<OrderProductInDTO> orderProducts, Integer customerId){
        return null;
    }

    @GetMapping("/getMyWithPage")
    public PageOutDTO<OrderListOutDTO> getMyWithPage(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                                     Integer customerId){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Integer orderId){
        return null;
    }
}
