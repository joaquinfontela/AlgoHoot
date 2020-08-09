package edu.fiuba.algo3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.File;


public class AppModel extends Application {

    private final Image fondo = new Image("file:src/media/imagenes/fondoPregunta.jpg");
    private final BorderPane root = new BorderPane();
    private final Scene scene = new Scene(root,800,600); //anchura y altura

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            //fondo
            ImageView imageView = new ImageView();
            imageView.setImage(fondo);
            imageView.setFitHeight(600);
            imageView.setFitWidth(800);
            root.getChildren().add(imageView);

            //juego
            Label pregunta = new Label("¿SOY UNA PREGUNTA MUY MUY LARGA Y PIENSO OCUPAR TODO EL ESPACIO QUE SE ME DE?");
            pregunta.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
            pregunta.setFont(new Font("FreeSans", 40));
            pregunta.setTranslateX(50);
            pregunta.setTranslateY(60);
            pregunta.setMaxSize(700,250);
            pregunta.setMinSize(700,250);
            pregunta.setWrapText(true);
            pregunta.setTextAlignment(TextAlignment.CENTER);
            VBox contenedorPreguntaBotones = new VBox();
            contenedorPreguntaBotones.setSpacing(70);

            VBox contenedorBotones = new VBox();
            contenedorBotones.setSpacing(25);

            HBox opcionesSuperiores = new HBox();
            opcionesSuperiores.setSpacing(20);
            Button opcionSuperiorIzqierda = new Button("opcion 1");
            opcionSuperiorIzqierda.setFont(new Font("FreeSans", 40));
            opcionSuperiorIzqierda.setMinSize(300,80);
            opcionSuperiorIzqierda.setMaxSize(300,80);
            opcionSuperiorIzqierda.setWrapText(true);
            opcionSuperiorIzqierda.setTextAlignment(TextAlignment.CENTER);
            opcionSuperiorIzqierda.setStyle("-fx-background-radius: 20; -fx-background-color: red");
            Button opcionSuperiorDerecha = new Button("opcion 2");
            opcionSuperiorDerecha.setFont(new Font("FreeSans", 40));
            opcionSuperiorDerecha.setMinSize(300,80);
            opcionSuperiorDerecha.setMaxSize(300,80);
            opcionSuperiorDerecha.setWrapText(true);
            opcionSuperiorDerecha.setTextAlignment(TextAlignment.CENTER);
            opcionSuperiorDerecha.setBackground(new Background(new BackgroundFill(Color.VIOLET, CornerRadii.EMPTY, Insets.EMPTY)));
            opcionesSuperiores.getChildren().add(opcionSuperiorIzqierda);
            opcionesSuperiores.getChildren().add(opcionSuperiorDerecha);
            opcionesSuperiores.setAlignment(Pos.CENTER);

            HBox opcionesInferiores = new HBox();
            opcionesInferiores.setSpacing(20);
            Button opcionInferiorIzquierda = new Button("opcion 3");
            opcionInferiorIzquierda.setFont(new Font("FreeSans", 40));
            opcionInferiorIzquierda.setMinSize(300,80);
            opcionInferiorIzquierda.setMaxSize(300,80);
            opcionInferiorIzquierda.setWrapText(true);
            opcionInferiorIzquierda.setTextAlignment(TextAlignment.CENTER);
            opcionInferiorIzquierda.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            Button opcionInferiorDerecha = new Button("opcion 4");
            opcionInferiorDerecha.setFont(new Font("FreeSans", 40));
            opcionInferiorDerecha.setMinSize(300,80);
            opcionInferiorDerecha.setMaxSize(300,80);
            opcionInferiorDerecha.setWrapText(true);
            opcionInferiorDerecha.setTextAlignment(TextAlignment.CENTER);
            opcionInferiorDerecha.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
            opcionesInferiores.getChildren().add(opcionInferiorIzquierda);
            opcionesInferiores.getChildren().add(opcionInferiorDerecha);
            opcionesInferiores.setAlignment(Pos.CENTER);

            Button enviar = new Button("Enviar Respuesta");
            enviar.setBackground(new Background(new BackgroundFill(Color.ORANGE, CornerRadii.EMPTY, Insets.EMPTY)));
            enviar.setFont(new Font("FreeSans", 20));
            enviar.setMinSize(220,50);
            enviar.setMaxSize(220,50);
            enviar.setWrapText(true);

            opcionInferiorIzquierda.setTextAlignment(TextAlignment.CENTER);
            contenedorBotones.getChildren().add(opcionesSuperiores);
            contenedorBotones.getChildren().add(opcionesInferiores);
            contenedorBotones.getChildren().add(enviar);
            contenedorBotones.setAlignment(Pos.BOTTOM_CENTER);
            contenedorPreguntaBotones.getChildren().add(pregunta);
            contenedorPreguntaBotones.getChildren().add(contenedorBotones);
            root.setCenter(contenedorPreguntaBotones);

            String path = "file:/home/joaquin/Escritorio/trabajos practicos/algo 3/tp2/src/media/musica/kahoot2.mp3";
            Media media = new Media(new File(path).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setAutoPlay(true);

            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}
