package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonOrdenable;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonOrdenableHandler implements EventHandler<ActionEvent> {

    private BotonOrdenable boton;
    private EnunciadosOpciones opcionesRespuesta;

    public BotonOrdenableHandler(BotonOrdenable botonAgrupable, EnunciadosOpciones enunciadosOpciones) {

        boton = botonAgrupable;
        opcionesRespuesta = enunciadosOpciones;
    }

    @Override
    public void handle(ActionEvent event) {

        if (!boton.estaOrdenado()) {
            opcionesRespuesta.agregarEnunciadoEnOrden(boton.getText());
            boton.setPosicion(opcionesRespuesta.obtenerOrden());
            boton.setText(boton.getText() + " (" + boton.getPosicion() + ")");
        } else {
            boton.setText(boton.getText().substring(0, boton.getText().length() - 4));
            boton.establecerNoOrdenado();
            opcionesRespuesta.eliminarEnunciadoEnOrden(boton.getText());
        }
    }
}
