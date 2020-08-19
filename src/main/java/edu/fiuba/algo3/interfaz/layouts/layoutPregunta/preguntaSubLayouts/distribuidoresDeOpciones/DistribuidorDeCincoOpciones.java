package edu.fiuba.algo3.interfaz.layouts.layoutPregunta.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.interfaz.botones.ListaOpcionesOrdenables;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.Arrays;

public class DistribuidorDeCincoOpciones extends DistribuidorDeOpcionesChicas {

    public DistribuidorDeCincoOpciones(ArrayList<String> opciones, GestorDeJuego gestor,
                                       EnunciadosOpciones opcionesRespuesta) {

        ListaOpcionesOrdenables listaOrdenable = new ListaOpcionesOrdenables();
        this.agregarOpcion(opciones.get(0), Arrays.asList(-400, -30), Color.RED,
                gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(1), Arrays.asList(400, -30), Color.BLUE,
                gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(2), Arrays.asList(-400, 80), Color.web("eacc0a"),
                gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(3), Arrays.asList(400, 80), Color.GREEN,
                gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(4), Arrays.asList(0, -30), Color.BLUEVIOLET,
                gestor, opcionesRespuesta, listaOrdenable);
    }
}