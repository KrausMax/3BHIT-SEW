import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * Erstellt am: 10.1.2019
 * Author: Maximilian Kraus
 * Beschreibung: Herzstück dieser Übung, hier kann auf die Daten der Kinder zugegriffen werden bzw die Lieferungen erstellt werden
 */
public class SAP {

    //Attribute

    public static Collection<Kind> allKinder = CSVReader.readFile("Kinder.csv");
    public static Collection<Wunsch> allWuensche = CSVReader.readFile("Wunschliste.csv");
    public static Collection<Wunsch> sortierteWuensche = sortWuenscheByVerhalten(allWuensche, allKinder);


    //Methoden

    //sortiert Wuensche aller nicht-braven Kinder aus
    public static Collection<Wunsch> sortWuenscheByVerhalten(Collection<Wunsch> unsortedWuensche, Collection<Kind> allKinder) {

        Collection<Wunsch> sortedWuensche = new TreeSet<>();
        Iterator iKind = allKinder.iterator();

        while (iKind.hasNext()) {
            Kind zwrKind = (Kind) iKind.next();                                                          //Nur für Verhaltensabfrage
            System.out.println(zwrKind.getVerhalten());
            if (zwrKind.getVerhalten()) ;
            {
                Iterator iWunsch = unsortedWuensche.iterator();
                while (iWunsch.hasNext()) {
                    Wunsch zwWunsch = (Wunsch) iWunsch.next();                                           //Nur für Verhaltensabfrage
                    if (zwrKind.getName().equals(zwWunsch.getName())) {
                        sortedWuensche.add(zwWunsch);
                    }
                }
            }
        }
        return sortedWuensche;
    }

    //gibt Verhalten des Kindes zurück
    public static Boolean getVerhaltenKind(String name) {

        Iterator<Kind> jKind = allKinder.iterator();

        while (jKind.hasNext() == true) {
            Kind zwKind = (Kind) jKind.next();
            if (zwKind.getVerhalten() == true) {
                return true;
            }
        }
        return null;
    }

    //gibt Wunschliste eines Kindes zurück
    public static Collection<Wunsch> getWunschlisteKind(String name) {

        Collection<Wunsch> kindWuensche = new TreeSet<>();

        for (Wunsch zwwunsch : sortierteWuensche) {
            if (name.equals(zwwunsch.getName())) {
                kindWuensche.add(zwwunsch);
            }
        }
        return kindWuensche;
    }

    //gibt Geschenkkosten eines Kindes zurück
    public static double getGesamtkostenKind(String name) {

        double kindGesamtkosten = 0.0;

        for (Wunsch zwwunsch : sortierteWuensche) {
            if (name.equals(zwwunsch.getName())) {
                kindGesamtkosten = kindGesamtkosten + zwwunsch.getKosten();
            }
        }
        return kindGesamtkosten;
    }

    //gibt Geschenkgewicht eines Kindes zurück
    public static double getGesamtgewichtKind(String name) {

        double kindGesamtgewicht = 0.0;

        for (Wunsch zwwunsch : sortierteWuensche) {
            if (name.equals(zwwunsch.getName())) {
                kindGesamtgewicht = kindGesamtgewicht + zwwunsch.getGewicht();
            }
        }
        return kindGesamtgewicht;
    }

    //gibt Gesamtgewicht aller Geschenke zurück
    public static double getGesamtgewichtAll() {

        double gesamtgewicht = 0.0;

        for (Wunsch zwwunsch : sortierteWuensche) {
            gesamtgewicht = gesamtgewicht + zwwunsch.getGewicht();
        }
        return gesamtgewicht;
    }

    //gibt Gesamtkosten aller Geschenke zurück
    public static double getGesamtkostenAll() {

        double gesamtkosten = 0.0;

        for (Wunsch zwwunsch : sortierteWuensche) {
            gesamtkosten = gesamtkosten + zwwunsch.getKosten();
        }
        return gesamtkosten;
    }
}
