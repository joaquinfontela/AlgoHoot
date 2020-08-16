package edu.fiuba.algo3.interfaz.botones.botonesComunes;

import edu.fiuba.algo3.interfaz.estilos.estilosBotonesComunes.EstilosBotonComenzar;
import javafx.scene.control.Button;

public class BotonComenzar extends Button {

    public BotonComenzar() {
        this.setSkin(new EstilosBotonComenzar(this));
    }
}
