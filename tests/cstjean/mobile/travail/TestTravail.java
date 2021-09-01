package cstjean.mobile.travail;

import junit.framework.TestCase;

public class TestTravail extends TestCase {

    public void testCreer() {
        String nomTravail1 = "TP1";
        Travail travail1 = new Travail(nomTravail1);

        assertEquals("TP1", nomTravail1);

        String nomTravail2 = "TP2";
        Travail travail2 = new Travail("TP2");

        assertEquals("TP2", nomTravail2);
        assertEquals("TP1", travail1.getNom());
    }
}
