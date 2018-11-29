public class MitgliedsAdresse {

    private String strasse;                             //Straße
    private int hnummer;                                //Hausnummer

    //Konstruktor

    public MitgliedsAdresse(String strasse, int hnummer) {
        this.strasse = strasse;
        this.hnummer = hnummer;
    }

    //Getter&Setter
    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHnummer() {
        return hnummer;
    }

    public void setHnummer(int hnummer) {
        this.hnummer = hnummer;
    }

    //toString
    @Override
    public String toString() {
        return getStrasse() + " " + getHnummer();
    }
}
