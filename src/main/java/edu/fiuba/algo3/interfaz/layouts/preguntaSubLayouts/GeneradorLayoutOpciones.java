package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts;

import edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones.*;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import javafx.scene.layout.StackPane;
import java.util.ArrayList;

public class GeneradorLayoutOpciones {

    StackPane layout;

    public StackPane generarLayout(ArrayList<String> opciones, GestorDeJuego gestor, EnunciadosOpciones opcionesRespuesta) {

        if (opciones.size() == 2){
            layout = new DistribuidorDeDosOpciones(opciones, gestor, opcionesRespuesta);
        } else if (opciones.size() == 3) {
            layout = new DistribuidorDeTresOpciones(opciones, gestor, opcionesRespuesta);
        } else if (opciones.size() == 4) {
            layout = new DistribuidorDeCuatroOpciones(opciones, gestor, opcionesRespuesta);
        } else if (opciones.size() == 5) {
            layout = new DistribuidorDeCincoOpciones(opciones, gestor, opcionesRespuesta);
        } else {
            layout = new DistribuidorDeSeisOpciones(opciones, gestor, opcionesRespuesta);
        }
        return layout;
    }
}