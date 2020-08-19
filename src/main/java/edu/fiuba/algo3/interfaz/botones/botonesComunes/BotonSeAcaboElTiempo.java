package edu.fiuba.algo3.interfaz.botones.botonesComunes;

import edu.fiuba.algo3.controladores.BotonSeAcaboElTiempoHandler;
import edu.fiuba.algo3.interfaz.estilos.estilosBotonesComunes.EstilosBotonSeAcaboElTiempo;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonSeAcaboElTiempo extends Button {

    public BotonSeAcaboElTiempo(Stage stage, GestorDeJuego gestor) {

        this.setSkin(new EstilosBotonSeAcaboElTiempo(this));
        this.setTranslateY(250);
        this.setOnAction(new BotonSeAcaboElTiempoHandler(stage, gestor));
    }
}