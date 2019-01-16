import java.util.Collection;

public class Lieferung {

    //Attribute
    private Collection<Wunsch> lieferWuensche;

    //Konstruktor


    public Lieferung() {
    }

    public Lieferung(Collection<Wunsch> lieferWuensche) {
        this.lieferWuensche = lieferWuensche;
    }

    //Getter&Setter

    public Collection<Wunsch> getLieferWuensche() {
        return lieferWuensche;
    }

    public void setLieferWuensche(Collection<Wunsch> lieferWuensche) {
        this.lieferWuensche = lieferWuensche;
    }

    @Override
    public String toString() {
        return "Lieferung: \n" + lieferWuensche;
    }
}
