package edu.fiuba.algo3.interfaz.botones.botonesOpcion;

import edu.fiuba.algo3.interfaz.botones.BotonSeleccionable;

public abstract class BotonOpcionSeleccionable extends BotonSeleccionable {

    public BotonOpcionSeleccionable(String enunciado, double posX, double posY) {

        this.setText(enunciado);
        this.setTranslateX(posX);
        this.setTranslateY(posY);
    }
}