package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonAgrupableChico;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonOpcionSeleccionableChicoLargo;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonOrdenableChico;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonOrdenableChicoLargo;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.pregunta.respuesta.RespuestaGroupChoice;
import edu.fiuba.algo3.modelo.pregunta.respuesta.RespuestaOrderedChoice;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import java.util.ArrayList;

public class DistribuidorDeCuatroOpciones extends StackPane {

    public DistribuidorDeCuatroOpciones(ArrayList<String> opciones, GestorDeJuego gestor) {

        this.agregarOpcion(opciones.get(0), -300, -50, Color.RED, gestor);
        this.agregarOpcion(opciones.get(1), 300, -50, Color.BLUE, gestor);
        this.agregarOpcion(opciones.get(2), -300, 60, Color.GOLD, gestor);
        this.agregarOpcion(opciones.get(3), 300, 60, Color.GREEN, gestor);
    }

    private void agregarOpcion(String enunciado, Integer desplazamientoEnX, Integer desplazamientoEnY,
                               Color color, GestorDeJuego gestor) {

        Button opcion;
        if (gestor.esTipoDeRespuestaComparable(RespuestaGroupChoice.class)) {
            opcion = new BotonAgrupableChico(enunciado, desplazamientoEnX, desplazamientoEnY);
        } else if (gestor.esTipoDeRespuestaComparable(RespuestaOrderedChoice.class)) {
            opcion = new BotonOrdenableChicoLargo(enunciado, desplazamientoEnX, desplazamientoEnY, color);
        } else {
            opcion = new BotonOpcionSeleccionableChicoLargo(enunciado, desplazamientoEnX, desplazamientoEnY, color);
        }
        this.getChildren().add(opcion);
    }
}