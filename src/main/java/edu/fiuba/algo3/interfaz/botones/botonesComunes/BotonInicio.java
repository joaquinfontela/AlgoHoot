package edu.fiuba.algo3.interfaz.botones.botonesComunes;

import edu.fiuba.algo3.interfaz.estilos.estilosBotonesComunes.EstilosBotonInicio;
import javafx.scene.control.Button;

public class BotonInicio extends Button {

    public BotonInicio() {

        this.setSkin(new EstilosBotonInicio(this));
    }
}
