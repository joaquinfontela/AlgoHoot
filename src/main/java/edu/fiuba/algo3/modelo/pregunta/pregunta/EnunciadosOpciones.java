package edu.fiuba.algo3.modelo.pregunta.pregunta;

import java.util.ArrayList;
import java.util.HashMap;

public class EnunciadosOpciones {

    private HashMap<Integer, ArrayList<String>> opciones;

    public EnunciadosOpciones(){
        opciones = new HashMap<>();
    }

    public void agregarEnunciadoEidentificador(int identificador, String enunciado) {

        ArrayList<String> enunciadosActuales;
        if (opciones.get(identificador) == null) {
            enunciadosActuales = new ArrayList<>();
        } else {
            enunciadosActuales = opciones.get(identificador);
        }
        enunciadosActuales.add(enunciado);
        opciones.put(identificador, enunciadosActuales);
    }

    public ArrayList<String> opcionesCorrectas(){
        return opciones.get(1);
    }

    public ArrayList<String> opcionesIncorrectas(){
        return opciones.get(0);
    }

    public ArrayList<String> opcionesGrupoA(){ return opciones.get(0); }

    public ArrayList<String> opcionesGrupoB(){
        return opciones.get(1);
    }

    public ArrayList<String> opcionesOrdenadas() {

        ArrayList<String> enunciadosOrdenados = new ArrayList<String>();
        for (int i = 0; i < opciones.size(); i++) {
            enunciadosOrdenados.add(opciones.get(i).get(0));
        }
        return enunciadosOrdenados;
    }
}