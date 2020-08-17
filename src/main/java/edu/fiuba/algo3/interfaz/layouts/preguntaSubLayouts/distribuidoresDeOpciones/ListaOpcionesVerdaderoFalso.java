package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonOpcionSeleccionable;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;

import java.util.ArrayList;

public class ListaOpcionesVerdaderoFalso extends ArrayList<BotonOpcionSeleccionable> {

    public ListaOpcionesVerdaderoFalso() {

        super();
    }

    public boolean add(BotonOpcionSeleccionable boton, EnunciadosOpciones opcionesRespuesta) {

        boolean valorADevolver = super.add(boton);
        boton.setOnMouseClicked(e -> {
            for (BotonOpcionSeleccionable b : this){
                if (!b.equals(boton) && b.fueSeleccionado()) {
                    opcionesRespuesta.agregarEnunciadoNoElegido(boton.getText());
                    b.switchSeleccionado();
                    actualizarOpacidad(b);
                }
            }
            boton.switchSeleccionado();
            actualizarOpacidad(boton);
        });
        return valorADevolver;
    }

    private void actualizarOpacidad(BotonOpcionSeleccionable boton) {

        if (boton.fueSeleccionado()) {
            boton.setOpacity(1.0);
        } else {
            boton.setOpacity(0.6);
        }
    }
}