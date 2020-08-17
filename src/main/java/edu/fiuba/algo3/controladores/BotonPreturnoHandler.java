package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.interfaz.layouts.LayoutPregunta;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonPreturnoHandler implements EventHandler<ActionEvent> {

    private Stage stage;
    private GestorDeJuego gestor;

    public BotonPreturnoHandler(Stage unStage, GestorDeJuego unGestor) {

        stage = unStage;
        gestor = unGestor;
    }

    @Override
    public void handle(ActionEvent event) {

        LayoutPregunta layoutPregunta = new LayoutPregunta(stage, gestor);
        stage.setScene(new Scene(layoutPregunta, 640, 480));
    }
}