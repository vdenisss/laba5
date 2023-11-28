package com.example.labar5.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
public class Feetback {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_feetback")
    private int idFeetback;
    @Basic
    @Column(name = "id_client")
    private int idClient;
    @Basic
    @Column(name = "id_user")
    private int idUser;
    @Basic
    @Column(name = "text_feetback")
    private String textFeetback;
    @Basic
    @Column(name = "count_stars")
    private int countStars;
    @Basic
    @Column(name = "data")
    private Date data;

    public Feetback(int idClient, int idUser, String textFeetback, int countStars, Date data) {
        this.idClient = idClient;
        this.idUser = idUser;
        this.textFeetback = textFeetback;
        this.countStars = countStars;
        this.data = data;
    }

    public Feetback() {
    }

    public int getIdFeetback() {
        return idFeetback;
    }

    public void setIdFeetback(int idFeetback) {
        this.idFeetback = idFeetback;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getTextFeetback() {
        return textFeetback;
    }

    public void setTextFeetback(String textFeetback) {
        this.textFeetback = textFeetback;
    }

    public int getCountStars() {
        return countStars;
    }

    public void setCountStars(int countStars) {
        this.countStars = countStars;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feetback feetback = (Feetback) o;
        return idFeetback == feetback.idFeetback && idClient == feetback.idClient && idUser == feetback.idUser && countStars == feetback.countStars && Objects.equals(textFeetback, feetback.textFeetback) && Objects.equals(data, feetback.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFeetback, idClient, idUser, textFeetback, countStars, data);
    }

    @Override
    public String toString() {
        return "Feetback{" +
                "idFeetback=" + idFeetback +
                ", idClient=" + idClient +
                ", idUser=" + idUser +
                ", textFeetback='" + textFeetback + '\'' +
                ", countStars=" + countStars +
                ", data=" + data +
                '}';
    }
}
