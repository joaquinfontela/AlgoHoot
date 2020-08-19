package edu.fiuba.algo3.interfaz.layouts.layoutPregunta.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.interfaz.botones.ListaOpcionesOrdenables;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable.BotonAgrupableChicoLargo;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonOrdenable.BotonOrdenable;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonOrdenable.BotonOrdenableChicoLargo;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonSeleccionable.BotonOpcionSeleccionableChicoLargo;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import edu.fiuba.algo3.modelo.pregunta.respuesta.RespuestaGroupChoice;
import edu.fiuba.algo3.modelo.pregunta.respuesta.RespuestaOrderedChoice;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

import java.util.*;

public class DistribuidorDeCuatroOpciones extends StackPane {

    public DistribuidorDeCuatroOpciones(ArrayList<String> opciones, GestorDeJuego gestor,
                                        EnunciadosOpciones opcionesRespuesta) {

        ListaOpcionesOrdenables listaOrdenable = new ListaOpcionesOrdenables();
        this.agregarOpcion(opciones.get(0), Arrays.asList(-300, -50), Color.RED,
                gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(1), Arrays.asList(300, -50), Color.BLUE,
                gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(2), Arrays.asList(-300, 60), Color.web("eacc0a"),
                gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(3), Arrays.asList(300, 60), Color.GREEN,
                gestor, opcionesRespuesta, listaOrdenable);
    }

    private void agregarOpcion(String enunciado, List<Integer> posicion, Color color,
                               GestorDeJuego gestor, EnunciadosOpciones opcionesRespuesta,
                               ListaOpcionesOrdenables listaOrdenables) {

        Button opcion;
        if (gestor.esTipoDeRespuestaComparable(RespuestaGroupChoice.class)) {
            opcion = new BotonAgrupableChicoLargo(enunciado, posicion, opcionesRespuesta);
        } else if (gestor.esTipoDeRespuestaComparable(RespuestaOrderedChoice.class)) {
            opcion = new BotonOrdenableChicoLargo(enunciado, posicion, color, opcionesRespuesta);
            listaOrdenables.add((BotonOrdenable) opcion);
        } else {
            opcion = new BotonOpcionSeleccionableChicoLargo(enunciado, posicion, color, opcionesRespuesta);
        }
        this.getChildren().add(opcion);
    }
}