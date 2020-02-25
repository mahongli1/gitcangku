package io.mhl.mhl_opencart.controller;

import io.mhl.mhl_opencart.dto.in.CustomerSearchInDTO;
import io.mhl.mhl_opencart.dto.out.CustomerListOutDTO;
import io.mhl.mhl_opencart.dto.out.CustomerShowOutDTO;
import io.mhl.mhl_opencart.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam Integer pageNum) {
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId) {
        return null;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){

    }
}
