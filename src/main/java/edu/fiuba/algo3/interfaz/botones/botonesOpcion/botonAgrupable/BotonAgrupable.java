package edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable;

import edu.fiuba.algo3.controladores.BotonAgrupableHandler;
import edu.fiuba.algo3.controladores.BotonOrdenableHandler;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.scene.control.Button;

import java.util.List;

public abstract class BotonAgrupable extends Button {

    private char grupo;

    public BotonAgrupable(String enunciado, List<Integer> posicion, EnunciadosOpciones opcionesRespuesta) {

        grupo = 'F';
        this.setText(enunciado);
        this.setTranslateX(posicion.get(0));
        this.setTranslateY(posicion.get(1));
        this.setOnAction(new BotonAgrupableHandler(this, opcionesRespuesta));
    }

    public void switchGrupo() {

        if (this.esGrupoA()) grupo = 'B';
        else grupo = 'A';
    }

    public boolean esGrupoA() {
        return grupo == 'A';
    }
}