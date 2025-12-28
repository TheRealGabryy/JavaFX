package AdminDashboard;

import AdminDashboard.UI.Composer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Objects;

public class Start extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();

        root.setTop(Composer.buildMenuBar());
        root.setCenter(Composer.buildMainBox());

        Scene scene = new Scene(root);
        scene.getStylesheets().add(
                Objects.requireNonNull(getClass().getResource("/AdminDashboard/CSS/style.css")).toExternalForm()
        );

        stage.setTitle("Admin Dashboard");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }
}
