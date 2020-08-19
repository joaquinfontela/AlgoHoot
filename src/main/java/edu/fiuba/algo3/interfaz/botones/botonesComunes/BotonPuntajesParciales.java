package edu.fiuba.algo3.interfaz.botones.botonesComunes;

import edu.fiuba.algo3.controladores.BotonPuntajesParcialesHandler;
import edu.fiuba.algo3.interfaz.estilos.estilosBotonesComunes.EstilosBotonPuntajesParciales;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonPuntajesParciales extends Button {

    public BotonPuntajesParciales(Stage stage, GestorDeJuego gestor) {

        this.setSkin(new EstilosBotonPuntajesParciales(this));
        this.setTranslateY(275);
        this.setOnAction(new BotonPuntajesParcialesHandler(stage, gestor));
    }
}