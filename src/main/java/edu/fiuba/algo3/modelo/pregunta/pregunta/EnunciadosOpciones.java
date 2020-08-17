package edu.fiuba.algo3.modelo.pregunta.pregunta;

import java.util.ArrayList;
import java.util.HashMap;

public class EnunciadosOpciones {

    private HashMap<Integer, ArrayList<String>> opciones;
    private int orden;

    public EnunciadosOpciones(){

        opciones = new HashMap<>();
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

        this.agregarEnunciado(enunciado, 0, 1);
    }

    public void agregarEnunciadoGrupoB(String enunciado) {

        this.agregarEnunciado(enunciado, 1, 0);
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

        int contador = 0;
        while (!opciones.get(contador).contains(enunciado) && contador < opciones.size()) contador++;
        orden = contador;
        for (int i = contador; i < opciones.size(); i++) this.agregarEnunciado(enunciado, -1, i);
    }

    public ArrayList<String> enunciadosCorrectos() throws Exception {

        if (opciones.get(1) != null && !opciones.get(1).isEmpty()) return opciones.get(1);
        throw new Exception("No ha selecionado ninguna opcion");
    }

    public ArrayList<String> enunciadosIncorrectos(){
        return opciones.get(0);
    }

    public ArrayList<String> enunciadosGrupoA() {

        if (opciones.get(0) == null) {
            return new ArrayList<>();
        } else {
            return opciones.get(0);
        }
    }

    public ArrayList<String> enunciadosGrupoB(){

        if (opciones.get(1) == null) {
            return new ArrayList<>();
        } else {
            return opciones.get(1);
        }
    }

    public ArrayList<String> enunciadosOrdenados() throws Exception {

        if (!opciones.get(-1).isEmpty()) throw new Exception("No has ordenado todas las opciones");
        ArrayList<String> enunciadosOrdenados = new ArrayList<>();
        for (int i = 0; i < opciones.size(); i++) {
            enunciadosOrdenados.add(opciones.get(i).get(0));
        }
        return enunciadosOrdenados;
    }

    @Override
    public String toString() {

        return opciones.toString();
    }
}