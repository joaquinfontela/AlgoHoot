package edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonOrdenable;

import edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion.EstilosBotonOrdenable;
import javafx.scene.paint.Color;

public class BotonOrdenableChico extends BotonOrdenable {

    public BotonOrdenableChico(String enunciado, double posX, double posY, Color color) {

        super(enunciado, posX, posY);
        this.setSkin(new EstilosBotonOrdenable(this, color,375,90));
    }
}