package edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonSeleccionable;

import edu.fiuba.algo3.interfaz.botones.BotonSeleccionable;

import java.util.List;

public abstract class BotonOpcionSeleccionable extends BotonSeleccionable {

    public BotonOpcionSeleccionable(String enunciado, List<Integer> posicion) {

        this.setText(enunciado);
        this.setTranslateX(posicion.get(0));
        this.setTranslateY(posicion.get(1));
    }
}