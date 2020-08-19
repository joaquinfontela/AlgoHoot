package edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonOrdenable;

import edu.fiuba.algo3.controladores.BotonOrdenableHandler;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.scene.control.Button;

import java.util.List;

public abstract class BotonOrdenable extends Button {

    private int posicion;
    private int posicionAnterior;

    public BotonOrdenable(String enunciado, List<Integer> posicionXY, EnunciadosOpciones opcionesRespuesta) {

        posicion = -1;
        this.setText(enunciado);
        this.setTranslateX(posicionXY.get(0));
        this.setTranslateY(posicionXY.get(1));
        this.setOnAction(new BotonOrdenableHandler(this, opcionesRespuesta));
    }

    public void setPosicion(Integer pos) {

        posicionAnterior = posicion;
        posicion = pos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void establecerNoOrdenado() {

        posicionAnterior = posicion;
        posicion = -1;
    }

    public boolean estaOrdenado() {
        return posicion != -1;
    }

    public int getPosicionAnterior() {
        return posicionAnterior;
    }
}