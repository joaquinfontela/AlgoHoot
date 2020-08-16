package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.scene.paint.Color;
import java.util.ArrayList;

public class DistribuidorDeDosOpciones extends DistribuidorDeOpcionesGrandes {

    public DistribuidorDeDosOpciones(ArrayList<String> opciones, GestorDeJuego gestor, EnunciadosOpciones opcionesRespuesta) {

        this.agregarOpcion(opciones.get(0), -245, 5, Color.RED, gestor, opcionesRespuesta);
        this.agregarOpcion(opciones.get(1), 245, 5, Color.BLUE, gestor, opcionesRespuesta);
    }
}