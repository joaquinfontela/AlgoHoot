package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.controladores.BotonAgrupableHandler;
import edu.fiuba.algo3.controladores.BotonOrdenableHandler;
import edu.fiuba.algo3.controladores.BotonOpcionSeleccionableHandler;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable.BotonAgrupable;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable.BotonAgrupableChico;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonOrdenable.BotonOrdenable;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonOrdenable.BotonOrdenableChicoLargo;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonSeleccionable.BotonOpcionSeleccionable;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonSeleccionable.BotonOpcionSeleccionableChicoLargo;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import edu.fiuba.algo3.modelo.pregunta.respuesta.RespuestaGroupChoice;
import edu.fiuba.algo3.modelo.pregunta.respuesta.RespuestaOrderedChoice;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import java.util.ArrayList;

public class DistribuidorDeCuatroOpciones extends StackPane {

    public DistribuidorDeCuatroOpciones(ArrayList<String> opciones, GestorDeJuego gestor,
                                        EnunciadosOpciones opcionesRespuesta) {

        ListaOpcionesOrdenables listaOrdenable = new ListaOpcionesOrdenables(opcionesRespuesta);
        this.agregarOpcion(opciones.get(0), -300, -50,
                Color.RED, gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(1), 300, -50,
                Color.BLUE, gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(2), -300, 60,
                Color.web("eacc0a"), gestor, opcionesRespuesta, listaOrdenable);
        this.agregarOpcion(opciones.get(3), 300, 60,
                Color.GREEN, gestor, opcionesRespuesta, listaOrdenable);
    }

    private void agregarOpcion(String enunciado, Integer desplazamientoEnX, Integer desplazamientoEnY,
                               Color color, GestorDeJuego gestor, EnunciadosOpciones opcionesRespuesta,
                               ListaOpcionesOrdenables listaOrdenables) {

        Button opcion;
        if (gestor.esTipoDeRespuestaComparable(RespuestaGroupChoice.class)) {
            opcion = new BotonAgrupableChico(enunciado, desplazamientoEnX, desplazamientoEnY);
            opcionesRespuesta.agregarEnunciadoGrupoA(enunciado);
            opcion.setOnAction(new BotonAgrupableHandler((BotonAgrupable)opcion, opcionesRespuesta));
        } else if (gestor.esTipoDeRespuestaComparable(RespuestaOrderedChoice.class)) {
            opcion = new BotonOrdenableChicoLargo(enunciado, desplazamientoEnX, desplazamientoEnY, color);
            opcionesRespuesta.agregarEnunciadoNoOrdenado(enunciado);
            listaOrdenables.add((BotonOrdenable) opcion);
            opcion.setOnAction(new BotonOrdenableHandler((BotonOrdenable)opcion, opcionesRespuesta));
        } else {
            opcion = new BotonOpcionSeleccionableChicoLargo(enunciado, desplazamientoEnX, desplazamientoEnY, color);
            opcionesRespuesta.agregarEnunciadoNoElegido(enunciado);
            opcion.setOnAction(new BotonOpcionSeleccionableHandler((BotonOpcionSeleccionable) opcion, opcionesRespuesta));
        }
        this.getChildren().add(opcion);
    }
}