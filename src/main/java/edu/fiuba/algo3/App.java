package edu.fiuba.algo3;

import edu.fiuba.algo3.interfaz.layouts.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;

/**
 * JavaFX App cC
 */
public class App extends Application {

    LayoutInicio layoutInicio;
    Scene scene;

    @Override
    public void start(Stage stage) {

        layoutInicio = new LayoutInicio(stage);
        scene = new Scene(layoutInicio, 640, 480);

        /*String path = "";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);*/

        mostrarStage(stage);
    }

    private void mostrarStage(Stage stage) {

        stage.setTitle("Algohoot!");
        stage.setScene(scene);
        stage.setHeight(720);
        stage.setWidth(1200);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}