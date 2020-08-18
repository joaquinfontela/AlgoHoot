package edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable.BotonAgrupable;
import edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion.EstilosBotonAgrupable;

import java.util.List;

public class BotonAgrupableChico extends BotonAgrupable {

    public BotonAgrupableChico(String enunciado, List<Integer> posicion) {

        super(enunciado, posicion);
        this.setSkin(new EstilosBotonAgrupable(this,375,90));
    }
}
