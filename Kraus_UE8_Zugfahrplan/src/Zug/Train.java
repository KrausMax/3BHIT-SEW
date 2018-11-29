package Zug;

import Zug.Stopps.Bahnhof.Station;
import Zug.Stopps.Stop;

import java.util.TreeSet;

public class Train {

    //Attribute

    TreeSet<Stop> train = new TreeSet<>();          //Set an Stops des Zuges
    private String tname;                           //Name des Zuges

    //Konstruktor

    public Train(String tname) {
        this.tname = tname;
    }

    //fügt 1 Stop hinzu
    public void addStop(String name, int stunden, int minuten, int bahnsteig) {
        Station xname = new Station(name);
        Stop xstop = new Stop(xname, stunden, minuten, bahnsteig);
        train.add(xstop);
    }

    //gibt 1. Stop zurück
    public Stop getfirstStop() {
        return train.first();
    }

    //gibt letzten Stop zurück
    public Stop getlastStop() {
        return train.last();
    }

    //Gibt alle Stops zurück
    public Stop[] getallStops() {
        Stop[] allstoparray = (Stop[]) train.toArray();
        return allstoparray;
    }

    //gibt alle Stops ab dem Stop mit dem Namen bhname zurück
    public Stop[] getStopsStartingWith(String bhname) {
        Station bhx = new Station(bhname);
        Stop[] teilstoparray = new Stop[0];
        for (Stop x : train) {
            int i = 0;
            if (x.getStopname().equals(bhx) == true) {
                teilstoparray[i] = x;
                i++;
            }
        }
        return teilstoparray;
    }

    //toString

    @Override
    public String toString() {
        return tname + " Stops: \n"
                + train;
    }
}
