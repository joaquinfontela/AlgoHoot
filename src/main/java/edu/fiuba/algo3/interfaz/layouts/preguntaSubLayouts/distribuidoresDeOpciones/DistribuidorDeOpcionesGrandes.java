package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonAgrupableGrande;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonOpcionSeleccionableGrande;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonOrdenableChico;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonOrdenableGrande;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.pregunta.respuesta.RespuestaGroupChoice;
import edu.fiuba.algo3.modelo.pregunta.respuesta.RespuestaOrderedChoice;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public abstract class DistribuidorDeOpcionesGrandes extends StackPane {

    protected void agregarOpcion(String enunciado, Integer desplazamientoEnX, Integer desplazamientoEnY,
                                 Color color, GestorDeJuego gestor) {

        Button opcion;
        if (gestor.esTipoDeRespuestaComparable(RespuestaGroupChoice.class)) {
            opcion = new BotonAgrupableGrande(enunciado, desplazamientoEnX, desplazamientoEnY);
        } else if (gestor.esTipoDeRespuestaComparable(RespuestaOrderedChoice.class)) {
            opcion = new BotonOrdenableGrande(enunciado, desplazamientoEnX, desplazamientoEnY, color);
        } else {
            opcion = new BotonOpcionSeleccionableGrande(enunciado, desplazamientoEnX, desplazamientoEnY, color);
        }
        this.getChildren().add(opcion);
    }
}