package edu.fiuba.algo3.interfaz.botones.botonesComunes;

import edu.fiuba.algo3.interfaz.estilos.estilosBotonesComunes.EstilosBotonJugar;
import javafx.scene.control.Button;

public class BotonJugar extends Button {

    public BotonJugar() {

        this.setSkin(new EstilosBotonJugar(this));
    }
}
