package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonSeleccionable.BotonOpcionSeleccionable;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.event.ActionEvent;

public class BotonOpcionSeleccionableHandler extends BotonSeleccionableHandler {

    private EnunciadosOpciones opcionesRespuesta;

    public BotonOpcionSeleccionableHandler(BotonOpcionSeleccionable botonSeleccionable,
                                           EnunciadosOpciones enunciadosOpciones) {
        super(botonSeleccionable);
        opcionesRespuesta = enunciadosOpciones;
        opcionesRespuesta.agregarEnunciadoNoElegido(boton.getText());
    }

    @Override
    public void handle(ActionEvent event) {

        super.handle(event);
        if (boton.fueSeleccionado()) {
            opcionesRespuesta.agregarEnunciadoElegido(boton.getText());
        } else {
            opcionesRespuesta.agregarEnunciadoNoElegido(boton.getText());
        }
    }
}