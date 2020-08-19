package edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable.BotonAgrupable;
import edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion.EstilosBotonAgrupable;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;

import java.util.List;

public class BotonAgrupableChico extends BotonAgrupable {

    public BotonAgrupableChico(String enunciado, List<Integer> posicion, EnunciadosOpciones opcionesRespuesta) {

        super(enunciado, posicion, opcionesRespuesta);
        this.setSkin(new EstilosBotonAgrupable(this,375,90));
    }
}
