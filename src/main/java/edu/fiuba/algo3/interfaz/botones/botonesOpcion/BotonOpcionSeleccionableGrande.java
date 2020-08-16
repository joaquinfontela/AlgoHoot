package edu.fiuba.algo3.interfaz.botones.botonesOpcion;

import edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion.EstilosBotonOpcionSeleccionable;
import javafx.scene.paint.Color;

public class BotonOpcionSeleccionableGrande extends BotonOpcionSeleccionable {

    public BotonOpcionSeleccionableGrande(String enunciado, double posX, double posY, Color color) {

        super(enunciado, posX, posY);
        this.setSkin(new EstilosBotonOpcionSeleccionable(this, color,390,180));
    }
}