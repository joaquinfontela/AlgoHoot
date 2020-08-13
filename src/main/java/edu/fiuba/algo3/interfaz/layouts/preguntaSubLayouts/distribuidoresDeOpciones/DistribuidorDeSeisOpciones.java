package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import java.util.ArrayList;

public class DistribuidorDeSeisOpciones extends DistribuidorDeOpcionesChicas {

    @Override
    public StackPane getLayout(ArrayList<String> opciones) {

        agregarOpcion(opciones.get(0), -400, -50, Color.RED);
        agregarOpcion(opciones.get(1), 400, -50, Color.BLUE);
        agregarOpcion(opciones.get(2), -400, 60, Color.GOLD);
        agregarOpcion(opciones.get(3), 400, 60, Color.GREEN);
        agregarOpcion(opciones.get(4), 0, 60, Color.ORANGE);
        agregarOpcion(opciones.get(5), 0, -50, Color.BLUEVIOLET);
        return layout;
    }
}