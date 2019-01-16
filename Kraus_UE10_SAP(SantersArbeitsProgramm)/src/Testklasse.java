import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

/*
 * Erstellt am: 10.1.2019
 * Author: Maximilian Kraus
 * Beschreibung: Hier wird SAP getestet
 */
public class Testklasse {

    //Attribute
    private final static double SCHLITTENKAPATZITAET = 500;
    private static Collection<Kind> allKinder = SAP.allKinder;
    private static Collection<Wunsch> sortWuensche = SAP.sortierteWuensche;
    private static Collection<Lieferung> allLieferungen = new LinkedList<>();

    public static void main(String[] args) {

        System.out.println("SAP TEST:");
        System.out.println("---------------------------------\n Kinder-Daten:");
        System.out.println(SAP.getVerhaltenKind("Susi"));
        System.out.println(SAP.getWunschlisteKind("Thomas"));
        System.out.println(SAP.getGesamtgewichtKind("Franzi"));
        System.out.println(SAP.getGesamtkostenKind("Harald"));
        System.out.println(SAP.getGesamtgewichtAll());
        System.out.println(SAP.getGesamtkostenAll());
        getLieferungen((TreeSet) sortWuensche);
        System.out.println(allLieferungen);
        CSVWriter.writeFile(allLieferungen, "Lieferungen.csv");
    }

    //Methoden
    public static void getLieferungen(TreeSet<Wunsch> sortierteWuensche) {

        Collection<Wunsch> lieferWuensche = new TreeSet<>();
        double gewichtLieferungUebrig = SCHLITTENKAPATZITAET;

        for (Wunsch zwWunsch : sortierteWuensche) {
            if (zwWunsch.getGewicht() <= gewichtLieferungUebrig) {
                lieferWuensche.add(zwWunsch);
                gewichtLieferungUebrig = gewichtLieferungUebrig - zwWunsch.getGewicht();
            } else {
                Lieferung lieferung = new Lieferung(lieferWuensche);
                allLieferungen.add(lieferung);
                getLieferungen((TreeSet) sortierteWuensche.tailSet(zwWunsch));
            }
        }
        Lieferung lieferung = new Lieferung(lieferWuensche);
        allLieferungen.add(lieferung);
    }
}
