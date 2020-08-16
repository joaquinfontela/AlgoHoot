package edu.fiuba.algo3.interfaz.botones.botonesOpcion;

import edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion.EstilosBotonOpcionSeleccionable;
import javafx.scene.paint.Color;

public class BotonOpcionSeleccionableChicoLargo extends BotonOpcionSeleccionable {

    public BotonOpcionSeleccionableChicoLargo(String enunciado, double posX, double posY, Color color) {

        super(enunciado, posX, posY);
        this.setSkin(new EstilosBotonOpcionSeleccionable(this, color,520,50));
    }
}