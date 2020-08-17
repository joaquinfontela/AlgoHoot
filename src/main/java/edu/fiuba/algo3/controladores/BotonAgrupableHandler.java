package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonAgrupable;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonAgrupableHandler implements EventHandler<ActionEvent> {

    private EnunciadosOpciones opcionesRespuesta;
    private BotonAgrupable boton;

    public BotonAgrupableHandler(BotonAgrupable botonAgrupable, EnunciadosOpciones enunciadosOpciones) {

        opcionesRespuesta = enunciadosOpciones;
        boton = botonAgrupable;
    }

    @Override
    public void handle(ActionEvent event) {

        boton.switchGrupo();
        if (boton.esGrupoA()) {
            opcionesRespuesta.agregarEnunciadoGrupoA(boton.getText());
        } else {
            opcionesRespuesta.agregarEnunciadoGrupoB(boton.getText());
        }
    }
}
