/*
 * Erstellt am: 10.1.2019
 * Author: Maximilian Kraus
 * Beschreibung: Klasse Wunsch die für das SAP benötigt wird
 */
public class Wunsch implements Comparable<Wunsch> {

    //Attribute
    private String name;
    private String wunsch;
    private double kosten;
    private double gewicht;

    //Konstruktor
    public Wunsch(String name, String wunsch, double kosten, double gewicht) {
        this.name = name;
        this.wunsch = wunsch;
        this.kosten = kosten;
        this.gewicht = gewicht;
    }

    //Getter&Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWunsch() {
        return wunsch;
    }

    public void setWunsch(String wunsch) {
        this.wunsch = wunsch;
    }

    public double getKosten() {
        return kosten;
    }

    public void setKosten(double kosten) {
        this.kosten = kosten;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public String toString() {
        return name + ", " + wunsch + " kostet " + kosten + "€ und wiegt " + gewicht + "kg;";
    }

    @Override
    public int compareTo(Wunsch o) {
        return this.name.compareTo(o.getName());
    }
}
