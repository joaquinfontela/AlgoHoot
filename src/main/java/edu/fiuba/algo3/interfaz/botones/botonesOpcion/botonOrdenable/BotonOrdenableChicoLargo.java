package edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonOrdenable;

import edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion.EstilosBotonOrdenable;
import javafx.scene.paint.Color;

import java.util.List;

public class BotonOrdenableChicoLargo extends BotonOrdenable {

    public BotonOrdenableChicoLargo(String enunciado, List<Integer> posicionXY, Color color) {

        super(enunciado, posicionXY);
        this.setSkin(new EstilosBotonOrdenable(this, color,500,100));
    }
}