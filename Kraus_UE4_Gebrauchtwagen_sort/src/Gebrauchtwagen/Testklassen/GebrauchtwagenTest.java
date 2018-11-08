/*
Übung Gebrauchtwagen von: Maximilian Kraus
19.9.2018

Die Klasse Gebrauchtwagen ist die Testklasse die einen Array mit Fahrzeugen (Fuhrpark) sortieren lässt und sie dann ausgibt.
 */
package Gebrauchtwagen.Testklassen;

import Gebrauchtwagen.Fahrzeuge.Auto.Auto;
import Gebrauchtwagen.Fahrzeuge.Auto.Oldtimer.Oldtimer;
import Gebrauchtwagen.Fahrzeuge.Motorrad.Motorrad;
import Gebrauchtwagen.Interfaces.Fortbewegungsmittel;

import java.util.Arrays;

public class GebrauchtwagenTest {

    public static void main(String[] args) {

        Fortbewegungsmittel[] fuhrpark = new Fortbewegungsmittel[5];
        fuhrpark[0] = new Auto("BMW 500", 2005, 150, 10, 13000, 20000, 15000, 5);
        fuhrpark[1] = new Motorrad("Yamaha R6", 2007, 87, 6.6f, 8000, 16000, 12000, "4-Takt");
        fuhrpark[2] = new Oldtimer("Chevy Bel Air", 1960, 162, 4.6f, 3000, 10000, 15000, 4, 2);
        fuhrpark[3] = new Auto("Audi 2", 1999, 120, 12, 3000, 6000, 4500, 4);
        fuhrpark[4] = new Oldtimer("Alfa Romeo 8C 2900B Lungo Spider", 1939, 133, 2.9f, 17000000, 12000, 19800000, 2, 1);

        Arrays.sort(fuhrpark, new SortByCost());        //sortiert Fuhrpark nach dem Preis (aufsteigend)

        for (int i = 0; i < fuhrpark.length; i++) {            // gibt die Fahrzeuge nach dem Preis gelistet aus
            System.out.println(fuhrpark[i]);
        }
    }

}
