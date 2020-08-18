package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.interfaz.layouts.LayoutPreturno;
import edu.fiuba.algo3.interfaz.layouts.LayoutPuntajeFinal;
import edu.fiuba.algo3.interfaz.layouts.LayoutPuntajesParciales;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public abstract class BotonTerminarTurnoHandler extends AlertaHandler {

    protected Stage stage;
    protected GestorDeJuego gestor;

    public BotonTerminarTurnoHandler(Stage unStage, GestorDeJuego unGestor) {

        stage = unStage;
        gestor = unGestor;
    }

    public abstract void handle(ActionEvent event);

    protected void cambiarEscena() {

        StackPane layout;
        if (gestor.juegoFinalizado()) {
            Jugador posibleJugadorGanador = gestor.obtenerPosibleJugadorGanador();
            Jugador posibleJugadorPerdedor = gestor.obtenerPosibleJugadorPerdedor();
            layout = new LayoutPuntajeFinal(stage,posibleJugadorGanador, posibleJugadorPerdedor);
        } else if (gestor.comienzaNuevaRonda()) {
            layout = new LayoutPuntajesParciales(stage, gestor);
        } else {
            layout = new LayoutPreturno(stage, gestor);
        }
        stage.setScene(new Scene(layout, 640, 480));
    }
}