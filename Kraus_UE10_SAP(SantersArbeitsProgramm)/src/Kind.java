import java.util.HashSet;
import java.util.Set;

/*
 * Erstellt am: 10.1.2019
 * Author: Maximilian Kraus
 * Beschreibung: Klasse Kind die für das SAP benötigt wird
 */
public class Kind implements Comparable<Kind> {

    //Attribute
    private String name;
    private boolean verhalten;
    private Set<Wunsch> wuensche = new HashSet<>();

    //Konstruktor

    public Kind(String name, boolean verhalten) {
        this.name = name;
        this.verhalten = verhalten;
    }

    public Kind(String name, boolean verhalten, Set<Wunsch> wuensche) {
        this.name = name;
        this.verhalten = verhalten;
        this.wuensche = wuensche;
    }

    //Getter&Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getVerhalten() {
        return verhalten;
    }

    public void setVerhalten(boolean verhalten) {
        this.verhalten = verhalten;
    }

    @Override
    public String toString() {
        String s;
        s = name + ", war ein ";
        if (getVerhalten() == true) {
            s = s + "braves";
        } else {
            s = s + "nicht braves";
        }
        s = s + " Kind!";
        return s;
    }

    @Override
    public int compareTo(Kind o) {
        return this.name.compareTo(o.getName());
    }
}
