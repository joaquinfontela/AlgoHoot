package edu.fiuba.algo3.interfaz.layouts.layoutPregunta.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.Arrays;

public class DistribuidorDeTresOpciones extends DistribuidorDeOpcionesGrandes {

    public DistribuidorDeTresOpciones(ArrayList<String> opciones, GestorDeJuego gestor,
                                      EnunciadosOpciones opcionesRespuesta) {

        ListaOpcionesOrdenables listaOrdenable = new ListaOpcionesOrdenables(opcionesRespuesta);
        this.agregarOpcion(opciones.get(0), Arrays.asList(-395, 5), Color.RED,
                gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(1), Arrays.asList(395, 5), Color.web("eacc0a"),
                gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(2), Arrays.asList(0, 5), Color.BLUE,
                gestor, opcionesRespuesta, listaOrdenable);
    }
}