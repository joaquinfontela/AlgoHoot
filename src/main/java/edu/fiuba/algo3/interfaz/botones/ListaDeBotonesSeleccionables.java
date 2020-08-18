package edu.fiuba.algo3.interfaz.botones;

import javafx.event.ActionEvent;

import java.util.ArrayList;

public class ListaDeBotonesSeleccionables extends ArrayList<BotonSeleccionable> {

    public ListaDeBotonesSeleccionables() {
        super();
    }

    @Override
    public boolean add(BotonSeleccionable boton) {

        boolean valorADevolver = super.add(boton);
        boton.setOnMouseClicked(e -> {
            for (BotonSeleccionable b : this) {
                if (!b.equals(boton) && b.fueSeleccionado()) b.getOnAction().handle(new ActionEvent());
            }
        });
        return valorADevolver;
    }
}