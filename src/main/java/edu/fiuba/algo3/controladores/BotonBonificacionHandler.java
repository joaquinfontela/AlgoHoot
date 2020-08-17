package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.interfaz.botones.botonesBonificacion.BotonBonificacion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonBonificacionHandler implements EventHandler<ActionEvent> {

    BotonBonificacion boton;

    public BotonBonificacionHandler(BotonBonificacion botonBonificacion) {
        boton = botonBonificacion;
    }

    @Override
    public void handle(ActionEvent event) {
        boton.switchSeleccionado();
    }
}