package edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable;

import javafx.scene.control.Button;

public abstract class BotonAgrupable extends Button {

    private char grupo;

    public BotonAgrupable(String enunciado, double posX, double posY) {

        this.setText(enunciado);
        this.setTranslateX(posX);
        this.setTranslateY(posY);
    }

    public BotonAgrupable() {
        grupo = 'A';
    }

    public void switchGrupo() {

        if (this.esGrupoA()) grupo = 'B';
        else grupo = 'A';
    }

    public boolean esGrupoA() {
        return grupo == 'A';
    }
}
