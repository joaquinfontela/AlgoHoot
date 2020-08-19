package edu.fiuba.algo3.interfaz.botones.botonesComunes;

import edu.fiuba.algo3.controladores.BotonInicioHandler;
import edu.fiuba.algo3.interfaz.estilos.estilosBotonesComunes.EstilosBotonInicio;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonInicio extends Button {

    public BotonInicio(Stage stage) {

        this.setSkin(new EstilosBotonInicio(this));

        this.setTranslateY(200);

        this.setOnAction(new BotonInicioHandler(stage));
    }
}