package edu.fiuba.algo3.interfaz.botones.botonesComunes;

import edu.fiuba.algo3.controladores.BotonEnviarRespuestaHandler;
import edu.fiuba.algo3.interfaz.estilos.estilosBotonesComunes.EstilosBotonEnviarRespuesta;
import edu.fiuba.algo3.interfaz.layouts.layoutPregunta.LayoutPregunta;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonEnviarRespuesta extends Button {

    public BotonEnviarRespuesta(Stage stage, GestorDeJuego gestor, LayoutPregunta layout) {

        this.setSkin(new EstilosBotonEnviarRespuesta(this));
        this.setTranslateY(-10.0);
        this.setTranslateX(525.0);
        this.setOnAction(new BotonEnviarRespuestaHandler(stage, gestor, layout));
    }
}