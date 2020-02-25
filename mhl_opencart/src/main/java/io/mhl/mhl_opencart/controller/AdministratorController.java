package io.mhl.mhl_opencart.controller;

import io.mhl.mhl_opencart.dto.in.*;
import io.mhl.mhl_opencart.dto.out.AdministratorGetProfileOutDTO;
import io.mhl.mhl_opencart.dto.out.AdministratorListOutDTO;
import io.mhl.mhl_opencart.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    @GetMapping("/long")
    public String login(@RequestParam String username,
                        @RequestParam String password){
        return null;
    }

    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(Integer administratorId){
        return null;
    }

    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }

    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam(required = false,defaultValue = "1") Integer pageNum){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){

    }

    @GetMapping("/getPwdResetCode")
    public void getPwdResetCode(@RequestParam String email){

    }

    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody AdministratorResetPwdEmailInDTO administratorResetPwdEmailInDTO){

    }

    @PostMapping("/delete")
    public void delete(@RequestParam Integer administratorId){

    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> administratorIds){

    }



}
