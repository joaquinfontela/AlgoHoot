package edu.fiuba.algo3.interfaz.layouts.layoutPregunta.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.interfaz.botones.ListaDeBotonesSeleccionables;
import edu.fiuba.algo3.interfaz.botones.ListaOpcionesOrdenables;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonSeleccionable.BotonOpcionSeleccionable;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonSeleccionable.BotonOpcionSeleccionableGrande;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import edu.fiuba.algo3.modelo.pregunta.respuesta.RespuestaVerdaderoFalso;

import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistribuidorDeDosOpciones extends DistribuidorDeOpcionesGrandes {

    public DistribuidorDeDosOpciones(ArrayList<String> opciones, GestorDeJuego gestor,
                                     EnunciadosOpciones opcionesRespuesta) {

        if (gestor.esTipoDeRespuestaComparable(RespuestaVerdaderoFalso.class)) {
            ListaDeBotonesSeleccionables lista = new ListaDeBotonesSeleccionables();
            this.agregarOpcionVerdaderoFalso(opciones.get(0), Arrays.asList(-245, 5), Color.RED,
                    opcionesRespuesta, lista);
            this.agregarOpcionVerdaderoFalso(opciones.get(1), Arrays.asList(245, 5), Color.BLUE,
                    opcionesRespuesta, lista);
        } else {
            ListaOpcionesOrdenables listaOrdenable = new ListaOpcionesOrdenables();
            this.agregarOpcion(opciones.get(0), Arrays.asList(-245, 5), Color.RED,
                    gestor, opcionesRespuesta, listaOrdenable);
            this.agregarOpcion(opciones.get(1), Arrays.asList(245, 5), Color.BLUE,
                    gestor, opcionesRespuesta, listaOrdenable);
        }
    }

    private void agregarOpcionVerdaderoFalso(String enunciado, List<Integer> posicion,
                                             Color color, EnunciadosOpciones opcionesRespuesta,
                                             ListaDeBotonesSeleccionables lista) {

        BotonOpcionSeleccionable opcion = new BotonOpcionSeleccionableGrande(enunciado, posicion,
                color, opcionesRespuesta);
        lista.add(opcion);
        this.getChildren().add(opcion);
    }
}