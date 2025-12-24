import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage /*Stage is on layer 3, the deepest one*/) {
        //the root is on the graphical layer
        StackPane root = new StackPane();
        // we create a scene with that root. the scene is on layer 2
        Scene scene = new Scene(root);

        primaryStage.setTitle("My first app in JavaFX");

        //icon image
        Image img = new Image("logo-modified.png");
        primaryStage.getIcons().add(img);

        //fullscreen
        primaryStage.setMaximized(true);

        //very important command. we set the new scene, that has the new root. so we complete the 3 laers
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
