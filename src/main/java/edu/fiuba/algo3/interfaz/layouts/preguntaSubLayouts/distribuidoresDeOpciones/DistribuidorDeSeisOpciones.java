package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.modelo.GestorDeJuego;
import javafx.scene.paint.Color;
import java.util.ArrayList;

public class DistribuidorDeSeisOpciones extends DistribuidorDeOpcionesChicas {

    public DistribuidorDeSeisOpciones(ArrayList<String> opciones, GestorDeJuego gestor) {

        this.agregarOpcion(opciones.get(0), -400, -50, Color.RED, gestor);
        this.agregarOpcion(opciones.get(1), 400, -50, Color.BLUE, gestor);
        this.agregarOpcion(opciones.get(2), -400, 60, Color.GOLD, gestor);
        this.agregarOpcion(opciones.get(3), 400, 60, Color.GREEN, gestor);
        this.agregarOpcion(opciones.get(4), 0, 60, Color.ORANGE, gestor);
        this.agregarOpcion(opciones.get(5), 0, -50, Color.BLUEVIOLET, gestor);
    }
}