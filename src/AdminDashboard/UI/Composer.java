package AdminDashboard.UI;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.text.Text;

public class Composer {

    public static HBox buildMainBox() {
        HBox mainBox = new HBox();
        mainBox.getStyleClass().add("debugBox");

        mainBox.setMaxSize(
                Region.USE_PREF_SIZE,
                Region.USE_PREF_SIZE
        );

        Text loginText = new Text("Login/Register");
        loginText.getStyleClass().add("title");

        mainBox.getChildren().add(loginText);
        mainBox.setAlignment(Pos.TOP_CENTER);

        return mainBox;
    }

    public static MenuBar buildMenuBar() {
        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu windowMenu = new Menu("Window");
        Menu helpMenu = new Menu("Help");

        fileMenu.getItems().addAll(
                new MenuItem("New file"),
                new MenuItem("Open..."),
                new SeparatorMenuItem(),
                new MenuItem("Save"),
                new MenuItem("Save as...")
        );

        editMenu.getItems().addAll(
                new MenuItem("Undo"),
                new MenuItem("Redo"),
                new SeparatorMenuItem(),
                new MenuItem("Copy"),
                new MenuItem("Paste"),
                new MenuItem("Cut")
        );

        menuBar.getMenus().addAll(fileMenu, editMenu, windowMenu, helpMenu);
        return menuBar;
    }
}
