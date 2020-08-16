package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts;

import edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones.*;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import javafx.scene.layout.StackPane;
import java.util.ArrayList;

public class GeneradorLayoutOpciones {

    StackPane layout;

    public StackPane generarLayout(ArrayList<String> opciones, GestorDeJuego gestor) {

        if (opciones.size() == 2){
            layout = new DistribuidorDeDosOpciones(opciones, gestor);
        } else if (opciones.size() == 3) {
            layout = new DistribuidorDeTresOpciones(opciones, gestor);
        } else if (opciones.size() == 4) {
            layout = new DistribuidorDeCuatroOpciones(opciones, gestor);
        } else if (opciones.size() == 5) {
            layout = new DistribuidorDeCincoOpciones(opciones, gestor);
        } else {
            layout = new DistribuidorDeSeisOpciones(opciones, gestor);
        }
        return layout;
    }
}