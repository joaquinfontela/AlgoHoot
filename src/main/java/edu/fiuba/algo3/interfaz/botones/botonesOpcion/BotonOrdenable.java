package edu.fiuba.algo3.interfaz.botones.botonesOpcion;

import javafx.scene.control.Button;

public abstract class BotonOrdenable extends Button {

    private Integer posicion;
    private Integer posicionAnterior;

    public BotonOrdenable(String enunciado, double posX, double posY) {

        posicion = null;
        this.setText(enunciado);
        this.setTranslateX(posX);
        this.setTranslateY(posY);
    }

    public void setPosicion(Integer pos) {

        posicionAnterior = posicion;
        posicion = pos;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public Integer getPosicionAnterior() {
        return posicionAnterior;
    }
}