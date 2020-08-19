package edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.botonAgrupable.BotonAgrupable;
import edu.fiuba.algo3.interfaz.estilos.estilosBotonesComunes.EstilosBotonComun;
import javafx.animation.FadeTransition;
import javafx.geometry.Insets;
import javafx.scene.control.skin.ButtonSkin;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class EstilosBotonAgrupable extends EstilosBotonComun {

    public EstilosBotonAgrupable(BotonAgrupable unBoton, double anchura, double altura) {

        super(unBoton);

        boton.setStyle("-fx-border-color: black; -fx-border-width: 2px");

        boton.setBackground(new Background(new BackgroundFill(Color.web("d8b97b"), CornerRadii.EMPTY, Insets.EMPTY)));
        boton.setTextFill(Color.BLACK);
        boton.setFont(new Font("FreeSans", 25));
        boton.setPrefSize(anchura, altura);
    }
}