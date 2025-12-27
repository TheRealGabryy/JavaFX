package AdminDashboard;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Start extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Admin Dashboard");


        primaryStage.setMaximized(true);
        primaryStage.show();
    }
}
