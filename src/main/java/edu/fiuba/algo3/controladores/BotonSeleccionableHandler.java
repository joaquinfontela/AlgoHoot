package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.interfaz.botones.BotonSeleccionable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonSeleccionableHandler implements EventHandler<ActionEvent> {

    protected BotonSeleccionable boton;

    public BotonSeleccionableHandler(BotonSeleccionable botonSeleccionable){
        boton = botonSeleccionable;
    }

    @Override
    public void handle(ActionEvent event) {

        boton.switchSeleccionado();
        this.actualizarOpacidad();
    }

    protected void actualizarOpacidad() {

        if (boton.fueSeleccionado()) {
            boton.setOpacity(1.0);
        } else {
            boton.setOpacity(0.6);
        }
    }
}