package edu.fiuba.algo3.interfaz.layouts.layoutPregunta;

import edu.fiuba.algo3.interfaz.botones.botonesComunes.BotonEnviarRespuesta;
import edu.fiuba.algo3.interfaz.layouts.layoutPregunta.preguntaSubLayouts.*;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LayoutPregunta extends BorderPane {

    private GeneradorLayoutOpciones generadorLayoutOpciones;
    private LayoutBonificaciones layoutBonificaciones;
    private LayoutIzquierdoPregunta layoutIzquierdo;
    private EnunciadosOpciones opcionesRespuesta;

    public LayoutPregunta(Stage stage, GestorDeJuego gestor) {

        opcionesRespuesta = new EnunciadosOpciones();

        generadorLayoutOpciones = new GeneradorLayoutOpciones();
        this.setCenter(generadorLayoutOpciones.generarLayout(gestor, opcionesRespuesta));
        layoutBonificaciones = new LayoutBonificaciones(gestor);
        layoutIzquierdo = new LayoutIzquierdoPregunta(stage, gestor);
        LayoutEnunciadoPregunta layoutEnunciado = new LayoutEnunciadoPregunta(gestor.obtenerEnunciadoPreguntaActual());
        this.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
        this.setTop(layoutEnunciado);
        this.setRight(layoutBonificaciones);
        this.setLeft(layoutIzquierdo);

        BotonEnviarRespuesta botonEnviarRespuesta = new BotonEnviarRespuesta(stage, gestor, this);
        this.setBottom(botonEnviarRespuesta);
    }

    public void detenerTemporizador() {
        layoutIzquierdo.detenerTemporizador();
    }

    public EnunciadosOpciones obtenerOpcionesRespuestaJugador() {
        return opcionesRespuesta;
    }

    public boolean multiplicadorX2Seleccionado() {
        return layoutBonificaciones.multiplicadorX2Seleccionado();
    }

    public boolean multiplicadorX3Seleccionado() {
        return layoutBonificaciones.multiplicadorX3Seleccionado();
    }

    public boolean exclusividadSeleccionada() {
        return layoutBonificaciones.exclusividadSeleccionada();
    }
}