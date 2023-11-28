package com.example.labar5.service;

import com.example.labar5.model.Feetback;
import com.example.labar5.repository.FeatbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class FeetbackService implements FeetbackServiceInterface{

    @Autowired
    FeatbackRepository featbackRepository;

    @Override
    public void createFeetback(int idClient, int idUser, String comment, int countStar, Date data) {
        Feetback feetback = new Feetback(idClient, idUser,  comment, countStar, data);
        featbackRepository.save(feetback);
    }
}
