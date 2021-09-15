package cstjean.mobile.travail.rapport;

import cstjean.mobile.travail.CoursSession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RapportCours {

    private final List<CoursSession> listeCoursSession = new ArrayList<>();

    public void ajouter(CoursSession coursSession) {
        this.listeCoursSession.add(coursSession);

    }

    String getRapportCours(){

        StringBuilder builder = new StringBuilder();

        Collections.sort(listeCoursSession);
        for (CoursSession cours : listeCoursSession) {
            builder.append(cours.getDepartement())
                    .append(" ")
                    .append(cours.getNumero())
                    .append(ConstantesRapport.SAUT_LIGNE);
        }
        return builder.toString();
    }
}
