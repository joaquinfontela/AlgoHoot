package edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonSeleccionable;

import edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion.EstilosBotonOpcionSeleccionable;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.scene.paint.Color;

import java.util.List;

public class BotonOpcionSeleccionableChico extends BotonOpcionSeleccionable {

    public BotonOpcionSeleccionableChico(String enunciado, List<Integer> posicion, Color color, EnunciadosOpciones opcionesRespuesta) {

        super(enunciado, posicion, opcionesRespuesta);
        this.setSkin(new EstilosBotonOpcionSeleccionable(this, color,375, 90));
    }
}