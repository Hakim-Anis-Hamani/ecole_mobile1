package cstjean.mobile.travail;

import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;

public class TravailEquipes extends Travail{

    private final Map<Integer, String> coequipiers = new LinkedHashMap<>();

    TravailEquipes(String nom, Calendar dateRemise) {
        super(nom, dateRemise);
    }


    public void ajouterCoequipier(int da, String nomCoequipier) {
        coequipiers.put(da, nomCoequipier);
    }

     String getCoequipier(int da){
        return coequipiers.get(da);
    }
}
