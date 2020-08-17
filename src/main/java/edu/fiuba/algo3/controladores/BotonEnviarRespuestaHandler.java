package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.interfaz.layouts.LayoutPregunta;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.pregunta.respuesta.Respuesta;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class BotonEnviarRespuestaHandler extends BotonTerminarTurnoHandler {

    private LayoutPregunta layoutActual;

    public BotonEnviarRespuestaHandler(Stage unStage, GestorDeJuego unGestor, LayoutPregunta layout) {

        super(unStage, unGestor);
        layoutActual = layout;
    }

    @Override
    public void handle(ActionEvent event) {

        Respuesta respuesta = gestor.crearRespuestaComparable();
        try {
            System.out.println(layoutActual.obtenerOpcionesRespuestaJugador().enunciadosGrupoB());
            System.out.println(layoutActual.obtenerOpcionesRespuestaJugador().enunciadosGrupoA());
            respuesta.rellenar(layoutActual.obtenerOpcionesRespuestaJugador());
            gestor.terminarTurno(respuesta);
            layoutActual.detenerTemporizador();
            this.cambiarEscena();
        } catch (Exception exception) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(exception.getMessage());
            alert.show();
        }
    }
}