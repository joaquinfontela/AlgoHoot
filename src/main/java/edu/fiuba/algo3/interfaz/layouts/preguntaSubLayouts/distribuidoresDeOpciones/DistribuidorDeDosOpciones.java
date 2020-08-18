package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.controladores.BotonOpcionSeleccionableHandler;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonSeleccionable.BotonOpcionSeleccionable;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonSeleccionable.BotonOpcionSeleccionableGrande;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import edu.fiuba.algo3.modelo.pregunta.respuesta.RespuestaVerdaderoFalso;

import javafx.scene.paint.Color;
import java.util.ArrayList;

public class DistribuidorDeDosOpciones extends DistribuidorDeOpcionesGrandes {

    public DistribuidorDeDosOpciones(ArrayList<String> opciones, GestorDeJuego gestor,
                                     EnunciadosOpciones opcionesRespuesta) {

        if (gestor.esTipoDeRespuestaComparable(RespuestaVerdaderoFalso.class)) {
            ListaOpcionesVerdaderoFalso lista = new ListaOpcionesVerdaderoFalso(opcionesRespuesta);
            this.agregarOpcionVerdaderoFalso(opciones.get(0), -245, Color.RED,
                    opcionesRespuesta, lista);
            this.agregarOpcionVerdaderoFalso(opciones.get(1), 245, Color.BLUE,
                    opcionesRespuesta, lista);
        } else {
            ListaOpcionesOrdenables listaOrdenable = new ListaOpcionesOrdenables(opcionesRespuesta);
            this.agregarOpcion(opciones.get(0), -245, 5, Color.RED,
                    gestor, opcionesRespuesta, listaOrdenable);
            this.agregarOpcion(opciones.get(1), 245, 5, Color.BLUE,
                    gestor, opcionesRespuesta, listaOrdenable);
        }
    }

    private void agregarOpcionVerdaderoFalso(String enunciado, Integer desplazamientoEnX,
                                             Color color, EnunciadosOpciones opcionesRespuesta,
                                             ListaOpcionesVerdaderoFalso lista) {

        BotonOpcionSeleccionable opcion = new BotonOpcionSeleccionableGrande(enunciado, desplazamientoEnX,
                5, color);
        lista.add(opcion);
        opcion.setOnAction(new BotonOpcionSeleccionableHandler(opcion, opcionesRespuesta));
        this.getChildren().add(opcion);
    }
}