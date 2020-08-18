package edu.fiuba.algo3.interfaz.botones.botonesBonificacion;

import java.util.ArrayList;

public class ListaDeBotonesMultiplicador extends ArrayList<BotonBonificacion> {

    public ListaDeBotonesMultiplicador() {
        super();
    }

    @Override
    public boolean add(BotonBonificacion boton) {

        boolean valorADevolver = super.add(boton);
        boton.setOnMouseClicked(e -> {
            for (BotonBonificacion b : this){
                if (!b.equals(boton) && b.fueSeleccionado()) {
                    b.switchSeleccionado();
                    actualizarOpacidad(b);
                }
            }
        });
        return valorADevolver;
    }

    private void actualizarOpacidad(BotonBonificacion boton) {

        if (boton.fueSeleccionado()) {
            boton.setOpacity(1.0);
        } else {
            boton.setOpacity(0.6);
        }
    }
}