package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.modelo.GestorDeJuego;
import javafx.scene.paint.Color;
import java.util.ArrayList;

public class DistribuidorDeTresOpciones extends DistribuidorDeOpcionesGrandes {

    public DistribuidorDeTresOpciones(ArrayList<String> opciones, GestorDeJuego gestor) {

        this.agregarOpcion(opciones.get(0), -395, 5, Color.RED, gestor);
        this.agregarOpcion(opciones.get(1), 395, 5, Color.GOLD, gestor);
        this.agregarOpcion(opciones.get(2), 0, 5, Color.BLUE, gestor);
    }
}