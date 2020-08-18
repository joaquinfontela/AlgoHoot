package edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable;

import javafx.scene.control.Button;

import java.util.List;

public abstract class BotonAgrupable extends Button {

    private char grupo;

    public BotonAgrupable(String enunciado, List<Integer> posicion) {

        grupo = 'A';
        this.setText(enunciado);
        this.setTranslateX(posicion.get(0));
        this.setTranslateY(posicion.get(1));
    }

    public void switchGrupo() {

        if (this.esGrupoA()) grupo = 'B';
        else grupo = 'A';
    }

    public boolean esGrupoA() {
        return grupo == 'A';
    }
}
