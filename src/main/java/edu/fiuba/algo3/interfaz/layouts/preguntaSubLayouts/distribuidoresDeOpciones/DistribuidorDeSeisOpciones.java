package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.scene.paint.Color;
import java.util.ArrayList;

public class DistribuidorDeSeisOpciones extends DistribuidorDeOpcionesChicas {

    public DistribuidorDeSeisOpciones(ArrayList<String> opciones, GestorDeJuego gestor, EnunciadosOpciones opcionesRespuesta) {

        this.agregarOpcion(opciones.get(0), -400, -50,
                Color.RED, gestor, opcionesRespuesta);
        this.agregarOpcion(opciones.get(1), 400, -50,
                Color.BLUE, gestor, opcionesRespuesta);
        this.agregarOpcion(opciones.get(2), -400, 60,
                Color.GOLD, gestor, opcionesRespuesta);
        this.agregarOpcion(opciones.get(3), 400, 60,
                Color.GREEN, gestor, opcionesRespuesta);
        this.agregarOpcion(opciones.get(4), 0, 60,
                Color.ORANGE, gestor, opcionesRespuesta);
        this.agregarOpcion(opciones.get(5), 0, -50,
                Color.BLUEVIOLET, gestor, opcionesRespuesta);
    }
}