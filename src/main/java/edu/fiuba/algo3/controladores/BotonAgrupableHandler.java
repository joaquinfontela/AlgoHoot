package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable.BotonAgrupable;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class BotonAgrupableHandler implements EventHandler<ActionEvent> {

    private EnunciadosOpciones opcionesRespuesta;
    private BotonAgrupable boton;

    public BotonAgrupableHandler(BotonAgrupable botonAgrupable, EnunciadosOpciones enunciadosOpciones) {

        opcionesRespuesta = enunciadosOpciones;
        boton = botonAgrupable;
        opcionesRespuesta.agregarEnunciadoNoAgrupado(boton.getText());
    }

    @Override
    public void handle(ActionEvent event) {

        boton.switchGrupo();
        if (boton.esGrupoA()) {
            opcionesRespuesta.agregarEnunciadoGrupoA(boton.getText());
            boton.setTextFill(Color.WHITE);
            boton.setStyle("-fx-border-color: white; -fx-border-width: 2px");
            boton.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            opcionesRespuesta.agregarEnunciadoGrupoB(boton.getText());
            boton.setTextFill(Color.BLACK);
            boton.setStyle("-fx-border-color: black; -fx-border-width: 2px");
            boton.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
}