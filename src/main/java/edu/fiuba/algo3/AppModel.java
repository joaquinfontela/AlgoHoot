package edu.fiuba.algo3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AppModel extends Application {
    private final Image fondo = new Image("file:src/imagenes/fondoPregunta.jpg");
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
            Label pregunta = new Label("¿Cual es la peor materia de la fiuba?");
            pregunta.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
            pregunta.setScaleX(2);
            pregunta.setScaleY(2);
            VBox contenedorPreguntaBotones = new VBox();
            contenedorPreguntaBotones.setSpacing(30);

            VBox contenedorBotones = new VBox();
            contenedorBotones.setSpacing(10);

            HBox opcionesSuperiores = new HBox();
            opcionesSuperiores.setSpacing(10);
            Button opcionSuperiorIzqierda = new Button("opcion 1");
            Button opcionSuperiorDerecha = new Button("opcion 2");
            opcionesSuperiores.getChildren().add(opcionSuperiorDerecha);
            opcionesSuperiores.getChildren().add(opcionSuperiorIzqierda);

            HBox opcionesInferiores = new HBox();
            opcionesInferiores.setSpacing(10);
            Button opcionInferiorIzquierda = new Button("opcion 3");
            Button opcionInferiorDerecha = new Button("opcion 4");
            opcionesInferiores.getChildren().add(opcionInferiorIzquierda);
            opcionesInferiores.getChildren().add(opcionInferiorDerecha);

            contenedorBotones.getChildren().add(opcionesSuperiores);
            contenedorBotones.getChildren().add(opcionesInferiores);

            contenedorPreguntaBotones.getChildren().add(pregunta);
            contenedorPreguntaBotones.getChildren().add(contenedorBotones);
            root.setCenter(contenedorPreguntaBotones);
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
