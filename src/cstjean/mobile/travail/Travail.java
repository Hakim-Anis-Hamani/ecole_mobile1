package cstjean.mobile.travail;

import java.util.Calendar;

class Travail {
    private final String nom;
    private final Calendar dateRemise;


    Travail(String nom, Calendar dateRemise) {
        this.nom = nom;
        this.dateRemise = dateRemise;
    }

    public Calendar getDateRemise() {
        return dateRemise;
    }

    String getNom() {
        return nom;
    }

}
