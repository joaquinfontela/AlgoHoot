package edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonOrdenable;

import edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion.EstilosBotonOrdenable;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.scene.paint.Color;

import java.util.List;

public class BotonOrdenableChicoLargo extends BotonOrdenable {

    public BotonOrdenableChicoLargo(String enunciado, List<Integer> posicionXY, Color color, EnunciadosOpciones opcionesRespuesta) {

        super(enunciado, posicionXY, opcionesRespuesta);
        this.setSkin(new EstilosBotonOrdenable(this, color,500,100));
    }
}