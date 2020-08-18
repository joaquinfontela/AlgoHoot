package edu.fiuba.algo3.interfaz.estilos;

import edu.fiuba.algo3.interfaz.botones.BotonSeleccionable;
import javafx.animation.FadeTransition;
import javafx.scene.control.skin.ButtonSkin;
import javafx.util.Duration;

public class EstilosBotonSeleccionable extends ButtonSkin {

    protected BotonSeleccionable boton;

    public EstilosBotonSeleccionable(BotonSeleccionable unBoton) {

        super(unBoton);

        boton = unBoton;

        this.eventoMousePasaPorArriba();
    }

    protected void eventoMousePasaPorArriba() {

        final FadeTransition fadeIn = new FadeTransition(Duration.millis(100));
        fadeIn.setNode(boton);
        fadeIn.setToValue(0.8);
        boton.setOnMouseEntered(e -> {
            if (!boton.fueSeleccionado()) {
                fadeIn.playFromStart();
            }
        });

        final FadeTransition fadeOut = new FadeTransition(Duration.millis(100));
        fadeOut.setNode(boton);
        fadeOut.setToValue(0.6);
        boton.setOnMouseExited(e -> {
            if (!boton.fueSeleccionado()) {
                fadeOut.playFromStart();
            }
        });

        boton.setOpacity(0.6);
    }
}