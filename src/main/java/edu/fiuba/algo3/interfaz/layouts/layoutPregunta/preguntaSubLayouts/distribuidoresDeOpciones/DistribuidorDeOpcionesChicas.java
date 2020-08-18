package edu.fiuba.algo3.interfaz.layouts.layoutPregunta.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.controladores.BotonAgrupableHandler;
import edu.fiuba.algo3.controladores.BotonOrdenableHandler;
import edu.fiuba.algo3.controladores.BotonOpcionSeleccionableHandler;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable.BotonAgrupable;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable.BotonAgrupableChico;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonOrdenable.BotonOrdenable;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonOrdenable.BotonOrdenableChico;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonSeleccionable.BotonOpcionSeleccionable;
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
            opcion = new BotonAgrupableChico(enunciado, posicion);
            opcion.setOnAction(new BotonAgrupableHandler((BotonAgrupable)opcion, opcionesRespuesta));
        } else if (gestor.esTipoDeRespuestaComparable(RespuestaOrderedChoice.class)) {
            opcion = new BotonOrdenableChico(enunciado, posicion, color);
            listaOrdenables.add((BotonOrdenable) opcion);
            opcion.setOnAction(new BotonOrdenableHandler((BotonOrdenable) opcion, opcionesRespuesta));
        } else {
            opcion = new BotonOpcionSeleccionableChico(enunciado, posicion, color);
            opcion.setOnAction(new BotonOpcionSeleccionableHandler((BotonOpcionSeleccionable) opcion, opcionesRespuesta));
        }
        this.getChildren().add(opcion);
    }
}