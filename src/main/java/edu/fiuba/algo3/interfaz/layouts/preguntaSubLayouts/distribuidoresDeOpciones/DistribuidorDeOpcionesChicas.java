package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonAgrupableChico;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonOpcionSeleccionableChico;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonOrdenableChico;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.pregunta.respuesta.RespuestaGroupChoice;
import edu.fiuba.algo3.modelo.pregunta.respuesta.RespuestaOrderedChoice;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public abstract class DistribuidorDeOpcionesChicas extends StackPane {

    protected void agregarOpcion(String enunciado, Integer desplazamientoEnX,
                                 Integer desplazamientoEnY, Color color, GestorDeJuego gestor) {

        Button opcion;
        if (gestor.esTipoDeRespuestaComparable(RespuestaGroupChoice.class)) {
            opcion = new BotonAgrupableChico(enunciado, desplazamientoEnX, desplazamientoEnY);
        } else if (gestor.esTipoDeRespuestaComparable(RespuestaOrderedChoice.class)) {
            opcion = new BotonOrdenableChico(enunciado, desplazamientoEnX, desplazamientoEnY, color);
        } else {
            opcion = new BotonOpcionSeleccionableChico(enunciado, desplazamientoEnX, desplazamientoEnY, color);
        }
        this.getChildren().add(opcion);
    }
}