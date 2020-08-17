package edu.fiuba.algo3.interfaz.estilos.estilosBotonesComunes;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class EstilosBotonPuntajesParciales extends EstilosBotonComun {

    public EstilosBotonPuntajesParciales(Button unBoton) {

        super(unBoton);
        boton.setText("Seguir Jugando");
        boton.setTextFill(Color.GOLDENROD);
        boton.setPrefSize(500, 50);
        boton.setStyle("-fx-background-color: transparent; -fx-font-size: 50px; -fx-border-color: goldenrod;" +
                "-fx-border-radius: 10px; -fx-border-width: 10px");
    }
}