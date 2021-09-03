package cstjean.mobile.travail;

import junit.framework.TestCase;

public class TestCoursSession extends TestCase {

    public void testCreer() {
        CoursSession coursSession = new CoursSession("Philo", "101");
        assertEquals("Philo", coursSession.getDepartement());
        assertEquals("101", coursSession.getNumero());
        assertEquals(0, coursSession.getNombreTravaux());

    }

    public void testAjoutTravail() {
        CoursSession coursSession = new CoursSession("Philo", "101");

        Travail travail1 = new Travail("TP1");
        coursSession.ajouterTravail(travail1);
        assertEquals(1, coursSession.getNombreTravaux());
        assertEquals(travail1, coursSession.getTravail(0));

        Travail travail2 = new Travail("TP2");
        coursSession.ajouterTravail(travail2);
        assertEquals(2, coursSession.getNombreTravaux());
        assertEquals(travail1, coursSession.getTravail(0));
        assertEquals(travail2, coursSession.getTravail(1));
    }
}
