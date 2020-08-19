package edu.fiuba.algo3.interfaz.botones.botonesComunes;

import edu.fiuba.algo3.controladores.BotonVolverAlMenuHandler;
import edu.fiuba.algo3.interfaz.estilos.estilosBotonesComunes.EstilosBotonVolverAlInicio;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonVolverAlInicio extends Button {

    public BotonVolverAlInicio(Stage stage) {

        this.setSkin(new EstilosBotonVolverAlInicio(this));
        this.setTranslateY(250);
        this.setOnAction(new BotonVolverAlMenuHandler(stage));
    }
}