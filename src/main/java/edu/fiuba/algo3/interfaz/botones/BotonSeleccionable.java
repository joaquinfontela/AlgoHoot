package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.controladores.BotonSeleccionableHandler;
import javafx.scene.control.Button;

public abstract class BotonSeleccionable extends Button {

    private Boolean seleccionado;

    public BotonSeleccionable() {

        seleccionado = false;
        this.setOnAction(new BotonSeleccionableHandler(this));
    }

    public void switchSeleccionado() {
        seleccionado = !seleccionado;
    }

    public Boolean fueSeleccionado() {
        return seleccionado;
    }
}