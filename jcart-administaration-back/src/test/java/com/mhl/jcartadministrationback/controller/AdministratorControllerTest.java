package com.mhl.jcartadministrationback.controller;

import com.mhl.jcartadministrationback.constant.ClientExceptionConstant;
import com.mhl.jcartadministrationback.dto.in.AdministratorLoginInDTO;
import com.mhl.jcartadministrationback.dto.out.AdministratorLoginOutDTO;
import com.mhl.jcartadministrationback.exception.ClientException;
import com.mhl.jcartadministrationback.po.Administrator;
import com.mhl.jcartadministrationback.service.AdministratorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
class AdministratorControllerTest {

    @Autowired
    private AdministratorController administratorController;

    @MockBean
    private AdministratorService administratorService;

    @Test
    void loginSuccess() throws ClientException {
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("admin");
        administratorLoginInDTO.setPassword("123456");
        Administrator mockAdministrator = new Administrator();
        mockAdministrator.setUsername("admin");
        mockAdministrator.setEncryptedPassword("$2a$12$LCQseGaU5sCdBFX98Kid.OkOvcnUYYswQrbU732Y8kN.UbWDiEua.");
        when(administratorService.getByUsername("admin")).thenReturn(mockAdministrator);
        AdministratorLoginOutDTO loginOutDTO = administratorController.login(administratorLoginInDTO);
        assertNotNull(loginOutDTO);

    }

    @Test
    void loginWrongUsername(){
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("admin110");
        administratorLoginInDTO.setPassword("123456");
        try {
            AdministratorLoginOutDTO loginOutDTO = administratorController.login(administratorLoginInDTO);
        }catch (ClientException ex){
            String errCode = ex.getErrCode();
            assertEquals(ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRCODE, errCode);
        }
    }

    @Test
    void loginWrongPassword(){
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("admin");
        administratorLoginInDTO.setPassword("abcdef");
        try {
            AdministratorLoginOutDTO loginOutDTO = administratorController.login(administratorLoginInDTO);
        }catch (ClientException ex){
            String errCode = ex.getErrCode();
            assertEquals(ClientExceptionConstant.ADMINISTRATOR_PASSWORD_INVALID_ERRCODE, errCode);
        }
    }
}