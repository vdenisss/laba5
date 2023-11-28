package com.example.labar5.service;

import java.sql.Date;

public interface FeetbackServiceInterface {
    void createFeetback(int idClient, int idUser, String comment, int countStar, Date data);
}
