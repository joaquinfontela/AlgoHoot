package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonOrdenable;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;

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

                for (BotonOrdenable b : this){
                    if (!b.equals(boton) && b.getPosicion() != null) {
                        Integer posicion;
                        if(boton.getPosicion() != null){
                            posicion = boton.getPosicion();
                        } else {
                            posicion = boton.getPosicionAnterior();
                        }
                        if (b.getPosicion() > posicion) {
                            b.setText(b.getText().substring(0, b.getText().length() - 4));
                            b.setPosicion(null);
                            opcionesRespuesta.eliminarEnunciadoEnOrden(b.getText());
                        }
                    }
                }

        });
        return valorADevolver;
    }
}