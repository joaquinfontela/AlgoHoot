package edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonSeleccionable;

import edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion.EstilosBotonOpcionSeleccionable;
import javafx.scene.paint.Color;

import java.util.List;

public class BotonOpcionSeleccionableChicoLargo extends BotonOpcionSeleccionable {

    public BotonOpcionSeleccionableChicoLargo(String enunciado, List<Integer> posicion, Color color) {

        super(enunciado, posicion);
        this.setSkin(new EstilosBotonOpcionSeleccionable(this, color,520,50));
    }
}