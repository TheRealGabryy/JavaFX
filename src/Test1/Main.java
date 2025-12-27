package Test1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public static final HBox container = new HBox();
    @Override
    public void start(Stage primaryStage /*Stage is on layer 3, the deepest one*/) {
        //the root is on the graphical layer
        StackPane root = new StackPane();
        // we create a scene with that root. the scene is on layer 2
        Scene scene = new Scene(root);
        scene.setRoot(root);
        primaryStage.setTitle("My first app in JavaFX");
        root.getChildren().add(container);

        VBox vbox = new VBox();
        container.getChildren().add(vbox);
        int paddingValue = 20;
        Insets padding = new Insets(paddingValue, paddingValue, paddingValue, paddingValue);
        vbox.setPadding(padding);
        vbox.prefWidthProperty().bind(primaryStage.widthProperty().divide(2));
        vbox.setSpacing(10);

        HBox box1 = new HBox();
        HBox box2 = new HBox();
        HBox box3 = new HBox();
        HBox box4 = new HBox();
        HBox box5 = new HBox();

        vbox.getChildren().addAll(box1, box2, box3, box4, box5);

        Image img = new Image("Test1/logo-modified.png");
        primaryStage.getIcons().add(img);
        //fullscreen
        primaryStage.setMaximized(true);
        //very important command. we set the new scene, that has the new root. so we complete the 3 laers
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
