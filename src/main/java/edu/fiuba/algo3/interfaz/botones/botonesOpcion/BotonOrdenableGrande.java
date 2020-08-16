package edu.fiuba.algo3.interfaz.botones.botonesOpcion;

import edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion.EstilosBotonOrdenable;
import javafx.scene.paint.Color;

public class BotonOrdenableGrande extends BotonOrdenable {

    public BotonOrdenableGrande(String enunciado, double posX, double posY, Color color) {

        super(enunciado, posX, posY);
        this.setSkin(new EstilosBotonOrdenable(this, color,390,180));
    }
}