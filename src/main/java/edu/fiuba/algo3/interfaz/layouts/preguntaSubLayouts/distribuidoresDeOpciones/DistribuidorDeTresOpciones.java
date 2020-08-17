package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.scene.paint.Color;
import java.util.ArrayList;

public class DistribuidorDeTresOpciones extends DistribuidorDeOpcionesGrandes {

    public DistribuidorDeTresOpciones(ArrayList<String> opciones, GestorDeJuego gestor,
                                      EnunciadosOpciones opcionesRespuesta) {

        ListaOpcionesOrdenables listaOrdenable = new ListaOpcionesOrdenables(opcionesRespuesta);
        this.agregarOpcion(opciones.get(0), -395, 5,
                Color.RED, gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(1), 395, 5,
                Color.GOLD, gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(2), 0, 5,
                Color.BLUE, gestor, opcionesRespuesta, listaOrdenable);
    }
}