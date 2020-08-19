package edu.fiuba.algo3.interfaz.botones.botonesComunes;

import edu.fiuba.algo3.controladores.BotonPreturnoHandler;
import edu.fiuba.algo3.interfaz.estilos.estilosBotonesComunes.EstilosBotonPreturno;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonPreturno extends Button {

    public BotonPreturno(Stage stage, GestorDeJuego gestor) {

        this.setSkin(new EstilosBotonPreturno(this));
        this.setTranslateY(200.0);
        this.setOnAction(new BotonPreturnoHandler(stage, gestor));
    }
}