package io.mhl.controller;


import io.mhl.dto.in.CustomerChangePwdInDTO;
import io.mhl.dto.in.CustomerRegisterInDTO;
import io.mhl.dto.in.CustomerResetPwdInDTO;
import io.mhl.dto.in.CustomerUpdateProfileInDTO;
import io.mhl.dto.out.CustomerProfileOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {


    @PostMapping("/register")
    public Integer register(@RequestBody CustomerRegisterInDTO customerRegisterInDTO){
        return null;
    }


    @GetMapping("/login")
    public String login(){
        return null;
    }

    @GetMapping("/getProfile")
    public CustomerProfileOutDTO getProfile(@RequestParam Integer customerId){
        return null;
    }

    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody CustomerUpdateProfileInDTO customerUpdateProfileInDTO,
                              @RequestAttribute Integer customerId){

    }

    @PostMapping("/changePwd")
    public void changePwd(@RequestBody CustomerChangePwdInDTO customerChangePwdInDTO){

    }


    @GetMapping("/getPwdResetCode")
    public String getPwdResetCode(@RequestParam String email){
        return null;
    }

    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody CustomerResetPwdInDTO customerResetPwdInDTO){

    }





}
