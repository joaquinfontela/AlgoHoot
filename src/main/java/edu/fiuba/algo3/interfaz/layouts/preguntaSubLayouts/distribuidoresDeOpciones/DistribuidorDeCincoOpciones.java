package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.modelo.GestorDeJuego;
import javafx.scene.paint.Color;
import java.util.ArrayList;

public class DistribuidorDeCincoOpciones extends DistribuidorDeOpcionesChicas {

    public DistribuidorDeCincoOpciones(ArrayList<String> opciones, GestorDeJuego gestor) {

        this.agregarOpcion(opciones.get(0), -400, -30, Color.RED, gestor);
        this.agregarOpcion(opciones.get(1), 400, -30, Color.BLUE, gestor);
        this.agregarOpcion(opciones.get(2), -400, 80, Color.GOLD, gestor);
        this.agregarOpcion(opciones.get(3), 400, 80, Color.GREEN, gestor);
        this.agregarOpcion(opciones.get(4), 0, -30, Color.BLUEVIOLET, gestor);
    }
}