/*
Übung Gebrauchtwagen von: Maximilian Kraus
19.9.2018

Diese Klasse wird von Arrays.sort verwendet, sie implementiert Comparator und mithilfe von compare werden die Preise sortiert.
 */
package Gebrauchtwagen.Testklassen;

import Gebrauchtwagen.Interfaces.Fortbewegungsmittel;

import java.util.Comparator;

public class SortByCost implements Comparator<Fortbewegungsmittel> {


    @Override
    public int compare(Fortbewegungsmittel o1, Fortbewegungsmittel o2) {                    //Diese Methode vergleicht immer die Preise von 2 Fahrzeugen und gibt je nach Ergebniss -1,0,1 zurück.

        if (o1.getPreis() < o2.getPreis()) return -1;
        else if (o1.getPreis() == o2.getPreis()) return 0;
        else return 1;
    }
}
