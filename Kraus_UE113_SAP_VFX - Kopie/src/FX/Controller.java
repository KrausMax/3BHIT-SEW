package FX;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;


public class Controller {

    @FXML
    private ListView vlist_kinder;

    @FXML
    private ListView vlist_wuensche;

    public void initialize() {
        getData();
    }

    public void getData() {

        ObservableList<String> k_namen = FXCollections.observableArrayList();
        for (Kind kind : SAP.allKinder) {
            k_namen.add(kind.getName());
        }

        ObservableList<String> k_wuensche = FXCollections.observableArrayList();
        for (Wunsch wunsch : SAP.sortierteWuensche) {
            k_wuensche.add("Name: " + wunsch.getName() + ", Wuensche: " + wunsch.getWunsch());
        }

        vlist_kinder.setItems(k_namen);
        vlist_wuensche.setItems(k_wuensche);
    }

    @FXML
    public void handleMouseClick(javafx.scene.input.MouseEvent mouseEvent) {

        try {
            String kind_Name = (String) vlist_kinder.getSelectionModel().getSelectedItem();
            vlist_wuensche.setItems(SAP.getWunschlisteKind(kind_Name));
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
