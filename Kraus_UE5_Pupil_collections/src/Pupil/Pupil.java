package Pupil;

public class Pupil {

    //Attribute
    private String nName;           //Vorname
    private String vName;           //Nachname
    private String klasse;          //Klasse
    private int katNr;              //Katalognummer
    private int schuelerID;         //Schüler-ID

    //Konstruktor

    public Pupil(String nName, String vName, String klasse, int katNr, int schuelerID) {
        this.nName = nName;
        this.vName = vName;
        this.klasse = klasse;
        this.katNr = katNr;
        this.schuelerID = schuelerID;
    }

    //Getter&Setter

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public String getKlasse() {
        return klasse;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

    public int getKatNr() {
        return katNr;
    }

    public void setKatNr(int katNr) {
        this.katNr = katNr;
    }

    public int getSchuelerID() {
        return schuelerID;
    }

    public void setSchuelerID(int schuelerID) {
        this.schuelerID = schuelerID;
    }

    // toString Methode überschriebens

    @Override
    public String toString() {
        return "Der Schueler " + nName + " " + vName + " der Klasse " + klasse + " hat die Schueler-ID: " + schuelerID;
    }
}
