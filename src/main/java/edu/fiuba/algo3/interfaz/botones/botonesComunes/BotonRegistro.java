package edu.fiuba.algo3.interfaz.botones.botonesComunes;

import edu.fiuba.algo3.interfaz.estilos.estilosBotonesComunes.EstilosBotonRegistro;
import javafx.scene.control.Button;

public class BotonRegistro extends Button {

    public BotonRegistro() {
        this.setSkin(new EstilosBotonRegistro(this));
    }
}