package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonSeleccionable.BotonOpcionSeleccionable;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonOpcionSeleccionableHandler implements EventHandler<ActionEvent> {

    private EnunciadosOpciones opcionesRespuesta;
    private BotonOpcionSeleccionable boton;

    public BotonOpcionSeleccionableHandler(BotonOpcionSeleccionable botonSeleccionable,
                                           EnunciadosOpciones enunciadosOpciones) {

        opcionesRespuesta = enunciadosOpciones;
        boton = botonSeleccionable;
    }

    @Override
    public void handle(ActionEvent event) {

        boton.switchSeleccionado();
        if (boton.fueSeleccionado()) {
            opcionesRespuesta.agregarEnunciadoElegido(boton.getText());
        } else {
            opcionesRespuesta.agregarEnunciadoNoElegido(boton.getText());
        }
    }
}
