package com.shandesh.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.shandesh.dao.AppUserDTO;
import com.shandesh.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
//@EnableAutoConfiguration
public class UserController {

    @Autowired
    private AppUserService appUserService;

    @RequestMapping(value = {"/getAllUsers"}, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllUsers() {
        ObjectMapper objectMapper = new ObjectMapper();
        String userListJSON = null;
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        try{
            userListJSON = objectMapper.writeValueAsString(appUserService.getAllAppUsers());
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return userListJSON;
    }

}
