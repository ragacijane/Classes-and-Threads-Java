package MediaPlayer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

import java.io.File;
import java.net.MalformedURLException;


public class Main extends Application {

    Player player;
    FileChooser fileChooser;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        MenuItem open = new MenuItem("Open");
        Menu file = new Menu("File");
        MenuBar menu = new MenuBar();

        file.getItems().add(open);
        menu.getMenus().add(file);

        open.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                player.player.pause();
                File file = fileChooser.showOpenDialog(primaryStage);
                if(file!=null){
                    try {
                        player = new Player(file.toURI().toURL().toExternalForm());
                        Scene  scene = new Scene(player, 720,480, Color.BLACK);
                        primaryStage.setScene(scene);
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        player = new Player("file:///I:/test.mp4");

        player.setTop(menu);

        Scene  scene = new Scene(player, 720,480, Color.BLACK);


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
