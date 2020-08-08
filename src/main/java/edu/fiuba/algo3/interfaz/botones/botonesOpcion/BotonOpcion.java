package edu.fiuba.algo3.interfaz.botones.botonesOpcion;

import edu.fiuba.algo3.interfaz.botones.Boton;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public abstract class BotonOpcion extends Boton {

    public BotonOpcion(String enunciado, double posX, double posY, Color color) {

        boton = new Button(enunciado);
        boton.setTranslateX(posX);
        boton.setTranslateY(posY);
    }
}
