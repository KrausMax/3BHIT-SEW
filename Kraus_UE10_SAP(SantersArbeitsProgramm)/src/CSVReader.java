import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.TreeSet;

/*
 * Erstellt am: 10.1.2019
 * Author: Maximilian Kraus
 * Beschreibung: Diese Klasse liest aus den CSV Dateien aus
 */
public class CSVReader {

    public static Collection readFile(String path) {
        File readingFile = new File(path);
        try {
            FileReader fr = new FileReader(readingFile);
            BufferedReader bw = new BufferedReader(fr);
            String descriptionLine = bw.readLine();
            if (descriptionLine.equals("Name;Verhalten;") == true) {
                Collection<Kind> readFileList = new TreeSet<>();
                String lineKind;
                String[] partsOfLineKind = new String[2];
                while ((lineKind = bw.readLine()) != null) {
                    partsOfLineKind = lineKind.split(";");
                    if (partsOfLineKind[1].equals("brav") == true) {
                        Kind newKid = new Kind(partsOfLineKind[0], true);
                        readFileList.add(newKid);
                    } else {
                        Kind newKid = new Kind(partsOfLineKind[0], false);
                        readFileList.add(newKid);
                    }
                }
                return readFileList;
            } else if (descriptionLine.equals("Name;Wunsch;Kosten;Gewicht;") == true) {
                Collection<Wunsch> readFileList = new TreeSet<>();
                String lineWunsch;
                String[] partsofLineWunsch = new String[4];
                while ((lineWunsch = bw.readLine()) != null) {
                    partsofLineWunsch = lineWunsch.split(";");
                    Wunsch newWunsch = new Wunsch(partsofLineWunsch[0], partsofLineWunsch[1], Double.parseDouble(partsofLineWunsch[2]), Double.parseDouble(partsofLineWunsch[3]));
                    readFileList.add(newWunsch);
                }
                return readFileList;
            } else {
                System.out.println("Unvalid File, please try again!");
            }

        } catch (IOException e) {
            System.out.println("Can't read File");
            System.exit(-1);
        }
        return null;
    }
}
