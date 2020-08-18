package edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonOrdenable;

import edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion.EstilosBotonOrdenable;
import javafx.scene.paint.Color;

import java.util.List;

public class BotonOrdenableGrande extends BotonOrdenable {

    public BotonOrdenableGrande(String enunciado, List<Integer> posicionXY, Color color) {

        super(enunciado, posicionXY);
        this.setSkin(new EstilosBotonOrdenable(this, color,390,180));
    }
}