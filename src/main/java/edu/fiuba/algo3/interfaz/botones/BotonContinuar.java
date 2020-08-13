package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.interfaz.estilos.EstilosBotonContinuar;

public class BotonContinuar extends Boton {

    public BotonContinuar() {

        super();
        this.setSkin(new EstilosBotonContinuar(this));

        this.setOnMouseClicked(e -> {
            System.out.println("CONTINUAR");
        });
    }
}
