import java.io.File;

public class FileEndChanger {
    public static void main(String[] args) {
        try {
            // Pfad der Dateien
            String path = "TMPVerzeichniss";

            // Neuen Ordner erstellen
            File newfolder = new File(path);

            // File-Array erstellen
            File[] arrFile = newfolder.listFiles();

            //Schleife die Files durchläuft und die mit class Endung umändert
            for (int i = 0; i < arrFile.length; i++) {
                if ((arrFile[i].isFile()) && (arrFile[i].getName().matches(".*\\.class"))) {

                    String newFName = arrFile[i].getName();

                    int position = newFName.lastIndexOf(".");
                    if (position > 0) {

                        newFName = newFName.substring(0, position);
                    }
                    arrFile[i].renameTo(new File(path + "/" + newFName + ".out"));
                }
            }
        } catch (Exception e) {
            System.out.println("Error, IOException");
        }
    }
}


