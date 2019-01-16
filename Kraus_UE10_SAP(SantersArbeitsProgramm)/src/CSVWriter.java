import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public class CSVWriter {

    public static void writeFile(Collection<Lieferung> lieferungCollection, String path) {

        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Lieferung lieferung : lieferungCollection) {
                Collection<Wunsch> wuensche = lieferung.getLieferWuensche();
                Iterator<Wunsch> iterwunsch = wuensche.iterator();
                while (iterwunsch.hasNext()) {
                    Wunsch wunsch = iterwunsch.next();
                    bw.write(wunsch.toString() + " ");
                }

            }
            bw.close();

        } catch (IOException e) {
            System.out.println("Error!");
        }
    }
}