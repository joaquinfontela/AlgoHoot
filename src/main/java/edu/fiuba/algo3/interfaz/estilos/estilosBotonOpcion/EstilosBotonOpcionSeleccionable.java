package edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion;

import edu.fiuba.algo3.interfaz.botones.BotonSeleccionable;
import edu.fiuba.algo3.interfaz.estilos.EstilosBotonSeleccionable;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class EstilosBotonOpcionSeleccionable extends EstilosBotonSeleccionable {

    public EstilosBotonOpcionSeleccionable(BotonSeleccionable unBoton, Color color, double anchura, double altura) {

        super(unBoton);
        boton.setStyle("-fx-border-color: black; -fx-border-width: 2px");

        boton.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
        boton.setTextFill(Color.WHITE);
        boton.setFont(new Font("FreeSans", 50));
        boton.setPrefSize(anchura, altura);
    }
}