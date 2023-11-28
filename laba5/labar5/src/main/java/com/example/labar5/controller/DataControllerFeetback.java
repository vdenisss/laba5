package com.example.labar5.controller;

import com.example.labar5.model.Feetback;
import com.example.labar5.service.FeetbackServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataControllerFeetback {

    @Autowired
    public FeetbackServiceInterface service;

    @PostMapping(value = "/createFeetBack", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void createFeetBack(@RequestBody Feetback feetback){
        service.createFeetback(feetback.getIdClient(), feetback.getIdUser(), feetback.getTextFeetback(),
                feetback.getCountStars(), feetback.getData());
    }
}
