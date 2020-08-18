package edu.fiuba.algo3.interfaz.estilos.estilosBotonesComunes;

import javafx.animation.FadeTransition;
import javafx.scene.control.Button;
import javafx.scene.control.skin.ButtonSkin;
import javafx.util.Duration;

public abstract class EstilosBotonComun extends ButtonSkin {

    protected Button boton;

    public EstilosBotonComun(Button unBoton) {

        super(unBoton);

        boton = unBoton;

        this.eventoMousePasaPorArriba();
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