package cstjean.mobile.travail;

import junit.framework.TestCase;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestTravail extends TestCase {

    public void testCreer() {
        Calendar dateRemise = new GregorianCalendar(2021,Calendar.SEPTEMBER, 3);
        String nomTravail1 = "TP1";
        Travail travail1 = new Travail(nomTravail1, dateRemise);

        assertEquals("TP1", nomTravail1);
        assertEquals(dateRemise, travail1.getDateRemise());

        String nomTravail2 = "TP2";
        Travail travail2 = new Travail("TP2",dateRemise);

        assertEquals("TP2", nomTravail2);
        assertEquals("TP1", travail1.getNom());
        assertEquals(dateRemise, travail2.getDateRemise());
    }


}
