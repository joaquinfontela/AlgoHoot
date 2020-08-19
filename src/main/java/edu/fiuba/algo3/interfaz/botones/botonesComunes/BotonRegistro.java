package edu.fiuba.algo3.interfaz.botones.botonesComunes;

import edu.fiuba.algo3.controladores.BotonRegistroHandler;
import edu.fiuba.algo3.interfaz.estilos.estilosBotonesComunes.EstilosBotonRegistro;
import edu.fiuba.algo3.interfaz.layouts.layoutRegistro.LayoutRegistro;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonRegistro extends Button {

    public BotonRegistro(Stage stage, LayoutRegistro layout) {

        this.setSkin(new EstilosBotonRegistro(this));
        this.setTranslateX(360.0);
        this.setTranslateY(-30.0);
        this.setOnAction(new BotonRegistroHandler(stage, layout));
    }
}