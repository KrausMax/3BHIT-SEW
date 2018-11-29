package Zug.Stopps;

import Zug.Stopps.Bahnhof.Station;

public class Stop implements Comparable<Stop> {

    //Attribute
    private Station stopname;           //Name des Stopps
    private int hzeitabfahrt;           //Stunde der Abfahrt
    private int mzeitabfahrt;           //Minuten der Abfahrt
    private int bahnsteig;              //Bahnsteig an dem Zug abfährt

    //Konstruktor


    public Stop(Station stopname, int hzeitabfahrt, int mzeitabfahrt, int bahnsteig) {
        this.stopname = stopname;
        this.hzeitabfahrt = hzeitabfahrt;
        this.mzeitabfahrt = mzeitabfahrt;
        this.bahnsteig = bahnsteig;
    }

    //Getter&Setter

    public Station getStopname() {
        return stopname;
    }

    public void setStopname(Station stopname) {
        this.stopname = stopname;
    }

    public int getHzeitabfahrt() {
        return hzeitabfahrt;
    }

    public void setHzeitabfahrt(int hzeitabfahrt) {
        this.hzeitabfahrt = hzeitabfahrt;
    }

    public int getMzeitabfahrt() {
        return mzeitabfahrt;
    }

    public void setMzeitabfahrt(int mzeitabfahrt) {
        this.mzeitabfahrt = mzeitabfahrt;
    }

    public int getBahnsteig() {
        return bahnsteig;
    }

    public void setBahnsteig(int bahnsteig) {
        this.bahnsteig = bahnsteig;
    }

    //toString

    @Override
    public String toString() {
        return stopname +
                "; Bahnsteig: " + bahnsteig +
                " um " + hzeitabfahrt +
                ":" + mzeitabfahrt + "\n";
    }


    //CompareTo
    @Override
    public int compareTo(Stop o) {

        int ozeit = o.getHzeitabfahrt() * 60 + o.getMzeitabfahrt();       //Zeiteinheit von o
        int zeit = getHzeitabfahrt() * 60 + getMzeitabfahrt();            //Zeiteinheit von jeweiligem element

        if (ozeit > zeit) {
            return -1;
        } else if (ozeit == zeit) {
            return 0;
        } else if (ozeit < zeit) {
            return 1;
        } else {
            return 0;
        }
    }
}
