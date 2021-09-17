package cstjean.mobile.travail;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestTravailEquipes extends TestTravail{

    @Override
    protected Travail creerTravail(String nom, Calendar dateRemise){
        return new TravailEquipes(nom, dateRemise);
    }

     public void testAjoutCoequipier(){
        TravailEquipes travail = (TravailEquipes) creerTravail("TP1", new GregorianCalendar(2021, Calendar.SEPTEMBER, 17));

        int da1 = 1667480;
        String coequipier1 = "Coequipier 1";
        travail.ajouterCoequipier(da1, coequipier1);
        assertEquals(coequipier1, travail.getCoequipier(da1));

        int da2 = 2667589;
        String coequipier2 = "Coequipier 2";
        travail.ajouterCoequipier(da2, coequipier2);
        assertEquals(coequipier2, travail.getCoequipier(da2));
        assertEquals(coequipier1, travail.getCoequipier(da1));
    }
}
