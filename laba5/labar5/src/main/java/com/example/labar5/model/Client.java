package com.example.labar5.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_client")
    private int idClient;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "apartment_number")
    private int apartmentNumber;
    @Basic
    @Column(name = "house_number")
    private int houseNumber;
    @Basic
    @Column(name = "street")
    private String street;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return idClient == client.idClient && apartmentNumber == client.apartmentNumber && houseNumber == client.houseNumber && Objects.equals(name, client.name) && Objects.equals(street, client.street) && Objects.equals(city, client.city) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClient, name, apartmentNumber, houseNumber, street, city);
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", name='" + name + '\'' +
                ", apartmentNumber=" + apartmentNumber +
                ", houseNumber=" + houseNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
