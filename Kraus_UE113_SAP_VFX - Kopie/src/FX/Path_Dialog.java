package FX;


import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class Path_Dialog {

    public static String getPath(String name) {
        TextInputDialog dialog = new TextInputDialog("MyFile.csv");
        dialog.setTitle("Pfadeingabe");
        dialog.setHeaderText("Pfadeingabe für " + name);
        dialog.setContentText("Bitte geben Sie den gewünschten Pfad an:");
        Optional<String> result = dialog.showAndWait();
        return result.get();

    }
}
