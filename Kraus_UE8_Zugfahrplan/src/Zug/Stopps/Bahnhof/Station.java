package Zug.Stopps.Bahnhof;

public class Station {

    //Attribute

    private String bhname;          //Name des Bahnhofes

    //Konstruktor

    public Station(String bhname) {
        this.bhname = bhname;
    }

    //Getter&Setter

    public String getBhname() {
        return bhname;
    }

    public void setBhname(String bhname) {
        this.bhname = bhname;
    }

    //toString

    @Override
    public String toString() {
        return "Bahnhof :" + bhname;
    }
}
