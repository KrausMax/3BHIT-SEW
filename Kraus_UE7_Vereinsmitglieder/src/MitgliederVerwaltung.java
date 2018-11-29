import java.util.HashMap;
import java.util.Map;

public class MitgliederVerwaltung {

    protected Map<Integer, MitgliedsAdresse> mitgliedAdressen = new HashMap<>();          // Hashmap mit Key Integer und Value MitgliedsAdresse

    //Konstruktor

    public MitgliederVerwaltung() {
    }

    public MitgliederVerwaltung(Map<Integer, MitgliedsAdresse> mitgliedAdressen) {
        this.mitgliedAdressen = mitgliedAdressen;
    }

    //Getter&Setter
    public Map<Integer, MitgliedsAdresse> getMitgliedAdressen() {
        return mitgliedAdressen;
    }

    public void setMitgliedAdressen(Map<Integer, MitgliedsAdresse> mitgliedAdressen) {
        this.mitgliedAdressen = mitgliedAdressen;
    }

    public void test() {                                                                          //Erstellt 3 Mitglieder füllt diese in Hashmap und gibt einen davon aus
        MitgliedsAdresse pers1 = new MitgliedsAdresse("Traunuferstraße", 5);
        MitgliedsAdresse pers2 = new MitgliedsAdresse("Traunuferstraße", 6);
        MitgliedsAdresse pers3 = new MitgliedsAdresse("Traunuferstraße", 7);

        mitgliedAdressen.put(1, pers1);
        mitgliedAdressen.put(2, pers2);
        mitgliedAdressen.put(3, pers3);

        for (Map.Entry<Integer, MitgliedsAdresse> e : mitgliedAdressen.entrySet()) {
            System.out.println("Key: " + e.getKey() + ", Wert: " + e.getValue());
            return;
        }
    }

    //toString
    @Override
    public String toString() {
        return super.toString();
    }
}
