package edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable;

import edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion.EstilosBotonAgrupable;

import java.util.List;

public class BotonAgrupableChicoLargo extends BotonAgrupable {

    public BotonAgrupableChicoLargo(String enunciado, List<Integer> posicion) {

        super(enunciado, posicion);
        this.setSkin(new EstilosBotonAgrupable(this,520,50));
    }
}