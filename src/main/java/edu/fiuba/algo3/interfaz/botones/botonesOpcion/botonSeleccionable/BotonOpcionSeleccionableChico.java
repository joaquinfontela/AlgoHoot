package edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonSeleccionable;

import edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion.EstilosBotonOpcionSeleccionable;
import javafx.scene.paint.Color;

public class BotonOpcionSeleccionableChico extends BotonOpcionSeleccionable {

    public BotonOpcionSeleccionableChico(String enunciado, double posX, double posY, Color color) {

        super(enunciado, posX, posY);
        this.setSkin(new EstilosBotonOpcionSeleccionable(this, color,375, 90));
    }
}