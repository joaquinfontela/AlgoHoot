package edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable.BotonAgrupable;
import edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion.EstilosBotonAgrupable;

public class BotonAgrupableChico extends BotonAgrupable {

    public BotonAgrupableChico(String enunciado, double posX, double posY) {

        super(enunciado, posX, posY);
        this.setSkin(new EstilosBotonAgrupable(this,375,90));
    }
}
