package edu.fiuba.algo3.interfaz.botones.botonesOpcion;

import edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion.EstilosBotonAgrupable;

public class BotonAgrupableGrande extends BotonAgrupable {

    public BotonAgrupableGrande(String enunciado, double posX, double posY) {

        super(enunciado, posX, posY);
        this.setSkin(new EstilosBotonAgrupable(this,390,180));
    }
}
