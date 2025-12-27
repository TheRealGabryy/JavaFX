package AdminDashboard;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Objects;

public class Start extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Admin Dashboard");

        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("CSS/style.css")).toExternalForm());
        HBox mainBox = new HBox();
        mainBox.getStyleClass().add("debugBox");
        mainBox.prefWidthProperty().bind(primaryStage.widthProperty().divide(3.5));
        mainBox.prefHeightProperty().bind(primaryStage.heightProperty().divide(1.4));

        //Since we user StackPane, we need to set the max size to be the prefsize, to avoid stretching the children
        mainBox.setMaxSize(
                Region.USE_PREF_SIZE,
                Region.USE_PREF_SIZE
        );
        root.getChildren().add(mainBox);

        Text loginText = new Text("Login/Register");
        loginText.getStyleClass().add("title");
        mainBox.getChildren().add(loginText);
        mainBox.setAlignment(Pos.TOP_CENTER);


        primaryStage.setMaximized(true);
        primaryStage.show();
    }
}
