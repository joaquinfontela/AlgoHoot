package edu.fiuba.algo3.interfaz.layouts.layoutPregunta.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.Arrays;

public class DistribuidorDeSeisOpciones extends DistribuidorDeOpcionesChicas {

    public DistribuidorDeSeisOpciones(ArrayList<String> opciones, GestorDeJuego gestor,
                                      EnunciadosOpciones opcionesRespuesta) {

        ListaOpcionesOrdenables listaOrdenable = new ListaOpcionesOrdenables(opcionesRespuesta);
        this.agregarOpcion(opciones.get(0), Arrays.asList(-400, -50), Color.RED,
                gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(1), Arrays.asList(400, -50), Color.BLUE,
                gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(2), Arrays.asList(-400, 60), Color.web("f3d309"),
                gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(3), Arrays.asList(400, 60), Color.GREEN,
                gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(4), Arrays.asList(0, 60), Color.ORANGE,
                gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(5), Arrays.asList(0, -50), Color.BLUEVIOLET,
                gestor, opcionesRespuesta, listaOrdenable);
    }
}