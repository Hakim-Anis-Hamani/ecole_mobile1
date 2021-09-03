package cstjean.mobile.travail;

import java.util.ArrayList;
import java.util.List;

class CoursSession {

    private final String departement;
    private final String numero;
    private final List<Travail> listeTraveaux = new ArrayList<>();

    public CoursSession(String departement, String numero) {
     this.departement = departement;
     this.numero = numero;
    }

    String getDepartement() {
        return departement;
    }

    String getNumero() {
        return numero;
    }

    int getNombreTravaux() {
        return listeTraveaux.size();
    }

    void ajouterTravail(Travail travail) {
        listeTraveaux.add(travail);
    }

    Travail getTravail(int position) {
        return listeTraveaux.get(position);
    }
}
