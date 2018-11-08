/*
Übung Gebrauchtwagen von: Maximilian Kraus
19.9.2018

Die Klasse Oldtimer ist die Subklasse von Auto und implementiert Sammlerstücke.
 */
package Gebrauchtwagen.Fahrzeuge.Auto.Oldtimer;

import Gebrauchtwagen.Fahrzeuge.Auto.Auto;
import Gebrauchtwagen.Interfaces.Sammlerstücke;

public class Oldtimer extends Auto implements Sammlerstücke {

    //Konstruktor

    protected int zstndnote;

    //Attribute

    public Oldtimer(String name, int erstzulassungsjahr, float leistung, float spritverbrauch, float eurotaxJeinkaufpreis, float realEinkaufspreis, float eurotaxJverkaufspreis, int anzahlSitze, int zstndnote) {
        super(name, erstzulassungsjahr, leistung, spritverbrauch, eurotaxJeinkaufpreis, realEinkaufspreis, eurotaxJverkaufspreis, anzahlSitze);
        this.zstndnote = zstndnote;
    }

    //Interface Methoden

    @Override
    public float sammlerpreis() {                                       //Mithilfe von der Zustandsnote wird der tatsächliche Preis von Oldtimern berechnet
        if (zstndnote == 1)
            return (eurotaxJverkaufspreis * 1.25f);        //je nach Zustandsnote wird der Preis gesteigert oder gesenkt
        else if (zstndnote == 2) return (eurotaxJverkaufspreis * 1.1f);
        else if (zstndnote == 3) return (eurotaxJverkaufspreis * 1f);
        else if (zstndnote == 4) return (eurotaxJverkaufspreis * 0.9f);
        else if (zstndnote == 5) return (eurotaxJverkaufspreis * 0.75f);
        return 0;
    }

    @Override
    public float getPreis() {
        return sammlerpreis();
    }

    //to String

    @Override
    public String toString() {
        return super.toString() + ", Zustandsnote: " + zstndnote + ", Sammlerpreis: " + sammlerpreis();
    }
}
