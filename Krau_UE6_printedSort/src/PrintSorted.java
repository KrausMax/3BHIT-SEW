import java.util.Set;
import java.util.TreeSet;

public class PrintSorted {

    private static final int SETLENGTH = 10;                            //Konstante für Setlänge

    public static void main(String[] args) {

        Set<Integer> gzSet = new TreeSet<>();                           //Set erstellt

        for (int i = 0; i < SETLENGTH; i++) {                           //Befüllt Set mit zufälligen Nummern
            gzSet.add((int) (Math.random() * 100 + 1));
        }
        //1. Teil der Ausgabe Original Werte
        System.out.println("Original Werte: " + gzSet);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.print("Mit 10 multiplizierte Werte: ");
        //2. Teil der Ausgabe gibt die mit 10 multiplizierten Nummern sortiert aus
        for (int element : gzSet) {
            System.out.print(element * 10 + ", ");
        }


    }

    @Override
    public String toString() {
        return super.toString();
    }
}
