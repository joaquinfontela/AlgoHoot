package edu.fiuba.algo3.interfaz.botones.botonesOpcion;

import javafx.scene.control.Button;

public abstract class BotonOrdenable extends Button {

    private Integer posicion;

    public BotonOrdenable(String enunciado, double posX, double posY) {

        posicion = null;
        this.setText(enunciado);
        this.setTranslateX(posX);
        this.setTranslateY(posY);
    }
}