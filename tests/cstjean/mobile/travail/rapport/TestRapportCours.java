package cstjean.mobile.travail.rapport;

import cstjean.mobile.travail.CoursSession;
import junit.framework.TestCase;

public class TestRapportCours extends TestCase {
    public void testRapport(){
        RapportCours rapport = new RapportCours();
        rapport.ajouter(new CoursSession("FRANCAIS", "101"));
        rapport.ajouter(new CoursSession("MATH", "301"));
        rapport.ajouter(new CoursSession("PHILO", "301"));
        rapport.ajouter(new CoursSession("MATH", "201"));
        rapport.ajouter(new CoursSession("PHILO", "201"));

        assertEquals("FRANCAIS 101" + ConstantesRapport.SAUT_LIGNE +
                "MATH 201" + ConstantesRapport.SAUT_LIGNE+
                "MATH 301" + ConstantesRapport.SAUT_LIGNE +
                "PHILO 201" + ConstantesRapport.SAUT_LIGNE +
                "PHILO 301" + ConstantesRapport.SAUT_LIGNE, rapport.getRapportCours());
    }
}
