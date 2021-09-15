package cstjean.mobile.travail;

import java.util.ArrayList;
import java.util.List;

public class CoursSession implements Comparable<CoursSession>{

    private final String departement;
    private final String numero;
    private final List<Travail> listeTraveaux = new ArrayList<>();

    public CoursSession(String departement, String numero) {
     this.departement = departement;
     this.numero = numero;
    }

    public String getDepartement() {
        return departement;
    }

    public String getNumero() {
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

    @Override

    public int compareTo(CoursSession o){
        int compareDepartement = getDepartement().compareTo(o.getDepartement());
        if (compareDepartement != 0){
            return compareDepartement;
        }
       return getNumero().compareTo(o.getNumero());
    }
}
