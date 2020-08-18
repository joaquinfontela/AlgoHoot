package edu.fiuba.algo3.interfaz.layouts.layoutPuntajes;

import edu.fiuba.algo3.controladores.BotonVolverAlMenuHandler;
import edu.fiuba.algo3.interfaz.botones.botonesComunes.BotonVolverAlInicio;
import edu.fiuba.algo3.interfaz.layouts.layoutPuntajes.puntajesSubLayouts.LayoutPuntajeJugador;
import edu.fiuba.algo3.modelo.jugador.Jugador;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LayoutPuntajeFinal extends StackPane {

    public LayoutPuntajeFinal(Stage stage, Jugador jugadorArriba, Jugador jugadorAbajo) {

        ImageView imageView = new ImageView();
        imageView.setImage(new Image("file:src/imagenes/fondo.jpg"));
        imageView.setFitHeight(760);
        imageView.setFitWidth(1300);
        this.getChildren().add(imageView);
        this.crearLayoutParteJugadorArriba(jugadorArriba, jugadorAbajo);
        this.crearLayoutParteJugadorAbajo(jugadorArriba,jugadorAbajo);

        Label label = new Label();
        label.setText("Resultados");
        label.setFont(new Font("FreeSans", 110));
        label.setTextFill(Color.web("a600ff"));
        label.setTranslateY(-300.0);
        this.getChildren().add(label);

        BotonVolverAlInicio botonContinuar = new BotonVolverAlInicio();
        botonContinuar.setTranslateY(250);
        botonContinuar.setOnAction(new BotonVolverAlMenuHandler(stage));
        this.getChildren().add(botonContinuar);
    }


    private void crearLayoutParteJugadorArriba(Jugador jugadorArriba,Jugador jugadorAbajo) {

        ImageView imageView = new ImageView();
        Color color;
        if (jugadorArriba.obtenerPuntaje() == jugadorAbajo.obtenerPuntaje()) {
            imageView.setImage(new Image("file:src/imagenes/empatamos.png"));
            color = Color.BROWN;
        } else {
            imageView.setImage(new Image("file:src/imagenes/caraGanador.png"));
            color = Color.LIMEGREEN;
        }

        LayoutPuntajeJugador layoutPuntajeArriba = new LayoutPuntajeJugador(jugadorArriba, color);
        layoutPuntajeArriba.setTranslateY(-150.0);
        this.getChildren().add(layoutPuntajeArriba);

        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        imageView.setTranslateX(150);
        imageView.setTranslateY(-150);
        this.getChildren().add(imageView);
    }

    private void crearLayoutParteJugadorAbajo(Jugador jugadorArriba, Jugador jugadorAbajo) {

        ImageView imageView = new ImageView();
        Color color;
        if (jugadorArriba.obtenerPuntaje() == jugadorAbajo.obtenerPuntaje()) {
            imageView.setImage(new Image("file:src/imagenes/empatamos.png"));
            color = Color.BROWN;
        } else {
            imageView.setImage(new Image("file:src/imagenes/caraPerdedor.png"));
            color = Color.DARKRED;
        }

        LayoutPuntajeJugador layoutPuntajeAbajo = new LayoutPuntajeJugador(jugadorAbajo, color);
        layoutPuntajeAbajo.setTranslateY(90.0);
        this.getChildren().add(layoutPuntajeAbajo);

        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        imageView.setTranslateX(150);
        imageView.setTranslateY(90);
        this.getChildren().add(imageView);
    }
}