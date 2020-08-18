package edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable.BotonAgrupable;
import javafx.animation.FadeTransition;
import javafx.geometry.Insets;
import javafx.scene.control.skin.ButtonSkin;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class EstilosBotonAgrupable extends ButtonSkin {

    protected BotonAgrupable boton;

    public EstilosBotonAgrupable(BotonAgrupable unBoton, double anchura, double altura) {

        super(unBoton);

        boton = unBoton;

        boton.setStyle("-fx-border-color: white; -fx-border-width: 2px");

        boton.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        boton.setTextFill(Color.WHITE);
        boton.setFont(new Font("FreeSans", 25));
        boton.setPrefSize(anchura, altura);

        eventoMousePasaPorArriba();
        eventoBotonClickeado();
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

    private void eventoBotonClickeado() {

        boton.setOnMouseClicked(e -> {

            if (e.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
                actualizarColor();
            }
        });
    }

    private void actualizarColor() {

        if (boton.esGrupoA()) {
            boton.setTextFill(Color.WHITE);
            boton.setStyle("-fx-border-color: white; -fx-border-width: 2px");
            boton.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            boton.setTextFill(Color.BLACK);
            boton.setStyle("-fx-border-color: black; -fx-border-width: 2px");
            boton.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
}