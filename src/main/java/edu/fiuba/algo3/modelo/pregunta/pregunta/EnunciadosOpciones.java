package edu.fiuba.algo3.modelo.pregunta.pregunta;

import java.util.ArrayList;
import java.util.HashMap;

public class EnunciadosOpciones {

    private HashMap<Integer, ArrayList<String>> opciones;
    private int orden;

    public EnunciadosOpciones(){

        opciones = new HashMap<>();
        for (int i = -1; i < 2; i++) opciones.put(i, new ArrayList<>());
        orden = 0;
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

    public void agregarEnunciadoElegido(String enunciado) {

        this.agregarEnunciado(enunciado, 1, 0);
    }

    public void agregarEnunciadoNoElegido(String enunciado) {

        this.agregarEnunciado(enunciado, 0, 1);
    }

    public void agregarEnunciadoGrupoA(String enunciado) {

        if (opciones.get(-1).contains(enunciado)) {
            this.agregarEnunciado(enunciado, 0, -1);
        } else {
            this.agregarEnunciado(enunciado, 0, 1);
        }
    }

    public void agregarEnunciadoGrupoB(String enunciado) {

        if (opciones.get(-1).contains(enunciado)) {
            this.agregarEnunciado(enunciado, 1, -1);
        } else {
            this.agregarEnunciado(enunciado, 1, 0);
        }
    }

    public void agregarEnunciadoNoAgrupado(String enunciado) {

        this.agregarEnunciadoEidentificador(-1, enunciado);
    }


    private void agregarEnunciado(String enunciado, int identificadorDondeAgregar, int identificadorDondeEliminar) {

        if (opciones.get(identificadorDondeEliminar) != null) {
            opciones.get(identificadorDondeEliminar).remove(enunciado);
        }
        this.agregarEnunciadoEidentificador(identificadorDondeAgregar,enunciado);
    }

    public int obtenerOrden() {
        return orden;
    }

    public void agregarEnunciadoEnOrden(String enunciado) {

        this.agregarEnunciado(enunciado, orden, -1);
        orden = orden + 1;
    }

    public void agregarEnunciadoNoOrdenado(String enunciado) {

        this.agregarEnunciadoEidentificador(-1, enunciado);
    }

    public void eliminarEnunciadoEnOrden(String enunciado) {

        int ordenNuevo = 0;
        for (Integer key : opciones.keySet()) {
            if (opciones.get(key).contains(enunciado)) {
                this.agregarEnunciado(opciones.get(key).get(0), -1, key);
            } else if (key != -1 && !opciones.get(key).isEmpty()) {
                ordenNuevo++;
            }
        }
        orden = ordenNuevo;
    }

    public ArrayList<String> enunciadosCorrectos() throws Exception {

        if (opciones.get(1).isEmpty()) throw new Exception("No ha selecionado ninguna opcion");
        return opciones.get(1);
    }

    public ArrayList<String> enunciadosIncorrectos() throws Exception {

        if (opciones.get(1).isEmpty()) throw new Exception("No ha selecionado ninguna opcion");
        return opciones.get(0);
    }

    public ArrayList<String> enunciadosGrupoA() throws Exception {

        if(!opciones.get(-1).isEmpty()) throw new Exception("No has agrupado todas las opciones");
        return opciones.get(0);
    }

    public ArrayList<String> enunciadosGrupoB() throws Exception {

        if(!opciones.get(-1).isEmpty()) throw new Exception("No has agrupado todas las opciones");
        return opciones.get(1);
    }

    public ArrayList<String> enunciadosOrdenados() throws Exception {

        if (!opciones.get(-1).isEmpty()) throw new Exception("No has ordenado todas las opciones");
        ArrayList<String> enunciadosOrdenados = new ArrayList<>();
        for (Integer key : opciones.keySet()) {
            if (key != -1) enunciadosOrdenados.add(opciones.get(key).get(0));
        }
        return enunciadosOrdenados;
    }

    @Override
    public String toString() {
        return opciones.toString();
    }
}