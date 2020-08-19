package edu.fiuba.algo3.interfaz.layouts.layoutPregunta.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable.BotonAgrupableChico;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonOrdenable.BotonOrdenable;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonOrdenable.BotonOrdenableChico;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonSeleccionable.BotonOpcionSeleccionableChico;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import edu.fiuba.algo3.modelo.pregunta.respuesta.RespuestaGroupChoice;
import edu.fiuba.algo3.modelo.pregunta.respuesta.RespuestaOrderedChoice;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

import java.util.List;

public abstract class DistribuidorDeOpcionesChicas extends StackPane {

    protected void agregarOpcion(String enunciado, List<Integer> posicion, Color color,
                                 GestorDeJuego gestor, EnunciadosOpciones opcionesRespuesta,
                                 ListaOpcionesOrdenables listaOrdenables) {

        Button opcion;
        if (gestor.esTipoDeRespuestaComparable(RespuestaGroupChoice.class)) {
            opcion = new BotonAgrupableChico(enunciado, posicion, opcionesRespuesta);
        } else if (gestor.esTipoDeRespuestaComparable(RespuestaOrderedChoice.class)) {
            opcion = new BotonOrdenableChico(enunciado, posicion, color, opcionesRespuesta);
            listaOrdenables.add((BotonOrdenable) opcion);
        } else {
            opcion = new BotonOpcionSeleccionableChico(enunciado, posicion, color, opcionesRespuesta);
        }
        this.getChildren().add(opcion);
    }
}