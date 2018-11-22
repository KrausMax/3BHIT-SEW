import java.util.Set;
import java.util.TreeSet;

public class PrintSorted {

    private static final int SETLENGTH = 10;

    public static void main(String[] args) {

        Set<Integer> gzSet = new TreeSet<>();

        for (int i = 0; i < SETLENGTH; i++) {
            gzSet.add((int) (Math.random() * 100 + 1));
        }
        System.out.println("Original Werte: " + gzSet);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.print("Mit 10 multiplizierte Werte: ");
        for (int element : gzSet) {
            System.out.print(element * 10 + ", ");
        }


    }

    @Override
    public String toString() {
        return super.toString();
    }
}
