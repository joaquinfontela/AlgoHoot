package edu.fiuba.algo3.interfaz.estilos.estilosBotonesComunes;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class EstilosBotonSeAcaboElTiempo extends EstilosBotonComun {

    public EstilosBotonSeAcaboElTiempo(Button boton) {

        super(boton);
        boton.setText("Siguiente turno");
        boton.setTextFill(Color.BLACK);
        boton.setPrefSize(500, 50);
        boton.setStyle("-fx-background-color: transparent; -fx-font-size: 50px; -fx-border-color: black;" +
                "-fx-border-radius: 10px; -fx-border-width: 10px");
    }
}