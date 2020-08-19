package edu.fiuba.algo3.interfaz.layouts.layoutPregunta.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonOrdenable.BotonOrdenable;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.event.ActionEvent;

import java.util.ArrayList;

public class ListaOpcionesOrdenables extends ArrayList<BotonOrdenable> {

    private EnunciadosOpciones opcionesRespuesta;

    public ListaOpcionesOrdenables(EnunciadosOpciones enunciadosOpciones) {

        super();
        opcionesRespuesta = enunciadosOpciones;
    }

    @Override
    public boolean add(BotonOrdenable boton) {

        boolean valorADevolver = super.add(boton);
        boton.setOnMouseClicked(e -> {
            if(!boton.estaOrdenado()) {
                for (BotonOrdenable b : this) {
                    if (!b.equals(boton) && b.getPosicion() > boton.getPosicionAnterior()) {
                        b.getOnAction().handle(new ActionEvent());
                    }
                }
            }
        });
        return valorADevolver;
    }
}