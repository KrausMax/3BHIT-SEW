import Zug.Train;

import java.util.LinkedList;
import java.util.List;

public class Timetable {

    //Attribute

    List<Train> Zugfahrplan = new LinkedList<>();

    //Konstruktor

    public Timetable() {
    }

    //Getter&Setter

    public List<Train> getZugfahrplan() {
        return Zugfahrplan;
    }

    public void setZugfahrplan(List<Train> zugfahrplan) {
        Zugfahrplan = zugfahrplan;
    }

    //toString

    @Override
    public String toString() {
        return "Fahrplan: \n" + Zugfahrplan;
    }
}
