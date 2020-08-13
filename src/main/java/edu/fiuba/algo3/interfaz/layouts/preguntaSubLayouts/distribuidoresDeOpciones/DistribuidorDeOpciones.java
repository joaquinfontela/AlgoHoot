package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import java.util.ArrayList;

public interface DistribuidorDeOpciones {

    StackPane layout = new StackPane();

    StackPane getLayout(ArrayList<String> opciones);

    void agregarOpcion(String enunciado, Integer desplazamientoEnX, Integer desplazamientoEnY, Color color);
}