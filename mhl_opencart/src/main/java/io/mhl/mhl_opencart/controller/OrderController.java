package io.mhl.mhl_opencart.controller;


import io.mhl.mhl_opencart.dto.in.OrderSearchInDTO;
import io.mhl.mhl_opencart.dto.out.OrderInvoiceShowOutDTO;
import io.mhl.mhl_opencart.dto.out.OrderListOutDTO;
import io.mhl.mhl_opencart.dto.out.OrderShipShowOutDTO;
import io.mhl.mhl_opencart.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO,
                                              @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public OrderListOutDTO getById(@RequestParam Integer orderId){
        return null;

    }

    @GetMapping("/getInvoice")
    public OrderInvoiceShowOutDTO getInvoice(@RequestParam Long OrderId){
        return null;
    }


    @GetMapping("/getShipInfo")
    public OrderShipShowOutDTO getShipInfo(@RequestParam Long OrderId){
        return null;
    }
}
