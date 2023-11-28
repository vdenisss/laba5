package com.example.labar5.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Rating {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_rating")
    private int idRating;
    @Basic
    @Column(name = "value_rating")
    private double valueRating;

    public int getIdRating() {
        return idRating;
    }

    public void setIdRating(int idRating) {
        this.idRating = idRating;
    }

    public double getValueRating() {
        return valueRating;
    }

    public void setValueRating(double valueRating) {
        this.valueRating = valueRating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rating rating = (Rating) o;
        return idRating == rating.idRating && Double.compare(rating.valueRating, valueRating) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRating, valueRating);
    }

    @Override
    public String toString() {
        return "Rating{" +
                "idRating=" + idRating +
                ", valueRating=" + valueRating +
                '}';
    }
}
