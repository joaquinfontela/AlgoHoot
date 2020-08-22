package edu.fiuba.algo3;

import edu.fiuba.algo3.interfaz.layouts.LayoutInicio;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.scene.media.Media;

import java.io.File;
import java.nio.file.Paths;

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

        mostrarStage(stage);
        //tocarMusica();
    }
    private void tocarMusica(){
        //opcion con audioclip
        //AudioClip audioClip = new AudioClip(Paths.get("src/musica/kahoot.mp3").toUri().toString());
        //audioClip.play();

        //opcion con media
        /*String path = "src/musica/kahoot.mp3";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);*/

    }
    private void mostrarStage(Stage stage) {

        stage.setTitle("Algohoot!");
        stage.setScene(scene);
        stage.setHeight(720);
        stage.setWidth(1200);
        stage.setResizable(false);
        stage.getIcons().add(new Image("file:src/imagenes/icon.png"));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
