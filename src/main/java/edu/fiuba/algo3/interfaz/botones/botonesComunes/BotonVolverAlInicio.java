package edu.fiuba.algo3.interfaz.botones.botonesComunes;


import edu.fiuba.algo3.interfaz.estilos.estilosBotonesComunes.EstilosBotonVolverAlInicio;
import javafx.scene.control.Button;

public class BotonVolverAlInicio extends Button {

    public BotonVolverAlInicio() {
        this.setSkin(new EstilosBotonVolverAlInicio(this));
    }
}