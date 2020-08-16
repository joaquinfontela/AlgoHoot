package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonOrdenable;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonOrdenableHandler implements EventHandler<ActionEvent> {

    private EnunciadosOpciones opcionesRespuesta;
    private BotonOrdenable boton;

    public BotonOrdenableHandler(BotonOrdenable botonAgrupable, EnunciadosOpciones enunciadosOpciones) {

        opcionesRespuesta = enunciadosOpciones;
        boton = botonAgrupable;
    }

    @Override
    public void handle(ActionEvent event) {

        if (boton.getPosicion() == null) {
            opcionesRespuesta.agregarEnunciadoEnOrden(boton.getText());
            boton.setPosicion(opcionesRespuesta.obtenerOrden());
        } else {
            opcionesRespuesta.eliminarEnunciadoEnOrden(boton.getText());
            boton.setPosicion(null);
        }
    }
}
