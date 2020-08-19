package edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonSeleccionable;

import edu.fiuba.algo3.controladores.BotonOpcionSeleccionableHandler;
import edu.fiuba.algo3.interfaz.botones.BotonSeleccionable;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;

import java.util.List;

public abstract class BotonOpcionSeleccionable extends BotonSeleccionable {

    public BotonOpcionSeleccionable(String enunciado, List<Integer> posicion, EnunciadosOpciones opcionesRespuesta) {

        this.setText(enunciado);
        this.setTranslateX(posicion.get(0));
        this.setTranslateY(posicion.get(1));
        this.setOnAction(new BotonOpcionSeleccionableHandler(this, opcionesRespuesta));
    }
}