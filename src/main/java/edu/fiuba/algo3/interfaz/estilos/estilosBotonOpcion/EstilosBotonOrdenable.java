package edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonOrdenable;
import javafx.animation.FadeTransition;
import javafx.geometry.Insets;
import javafx.scene.control.skin.ButtonSkin;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class EstilosBotonOrdenable extends ButtonSkin {

    protected BotonOrdenable boton;

    public EstilosBotonOrdenable(BotonOrdenable unBoton, Color color, double anchura, double altura) {

        super(unBoton);

        boton = unBoton;

        boton.setStyle("-fx-border-color: black; -fx-border-width: 2px");

        boton.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
        boton.setTextFill(Color.WHITE);
        boton.setFont(new Font("FreeSans", 25));
        boton.setPrefSize(anchura, altura);

        eventoMousePasaPorArriba();
    }

    protected void eventoMousePasaPorArriba() {

        final FadeTransition fadeIn = new FadeTransition(Duration.millis(100));
        fadeIn.setNode(boton);
        fadeIn.setToValue(0.8);
        boton.setOnMouseEntered(e -> {
            fadeIn.playFromStart();
        });

        final FadeTransition fadeOut = new FadeTransition(Duration.millis(100));
        fadeOut.setNode(boton);
        fadeOut.setToValue(0.6);
        boton.setOnMouseExited(e -> {
            fadeOut.playFromStart();
        });

        boton.setOpacity(0.6);
    }
}