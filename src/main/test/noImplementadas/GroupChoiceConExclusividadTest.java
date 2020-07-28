package noImplementadas;

import edu.fiuba.algo3.modelo.jugador.Jugador;
import edu.fiuba.algo3.modelo.pregunta.modalidad.Modalidad;
import edu.fiuba.algo3.modelo.pregunta.modalidad.ModalidadClasica;
import edu.fiuba.algo3.modelo.pregunta.modalidad.ModalidadPenalidad;
import edu.fiuba.algo3.modelo.pregunta.modalidad.bonificacion.ExclusividadDePuntaje;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import edu.fiuba.algo3.modelo.pregunta.pregunta.Pregunta;
import edu.fiuba.algo3.modelo.pregunta.respuesta.Respuesta;
import edu.fiuba.algo3.modelo.pregunta.respuesta.RespuestaGroupChoice;
import edu.fiuba.algo3.modelo.pregunta.respuesta.RespuestaMultipleChoice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupChoiceConExclusividadTest {

    Pregunta pregunta;

    Jugador jugador1;
    Jugador jugador2;

    RespuestaGroupChoice respuestaJugador1;
    RespuestaGroupChoice respuestaJugador2;

    EnunciadosOpciones opcionesParaAgregarJugador1;
    EnunciadosOpciones opcionesParaAgregarJugador2;

    @BeforeEach
    public void init() {

        Modalidad modalidad = new ModalidadClasica();

        ExclusividadDePuntaje exclusividadDePuntaje = new ExclusividadDePuntaje();
        modalidad.recibirBonificacion(exclusividadDePuntaje);

        String enunciado = "Agrupar los siguientes paises en africanos (0) y asiaticos (1).";

        Respuesta respuestaCorrecta = new RespuestaGroupChoice();

        EnunciadosOpciones opcionesParaAgregar = new EnunciadosOpciones();

        opcionesParaAgregar.agregarEnunciadoEidentificador(1, "Israel");
        opcionesParaAgregar.agregarEnunciadoEidentificador(0, "Egipto");
        opcionesParaAgregar.agregarEnunciadoEidentificador(1, "Yemen");
        opcionesParaAgregar.agregarEnunciadoEidentificador(0, "Sudan");
        opcionesParaAgregar.agregarEnunciadoEidentificador(0, "Yibuti");
        opcionesParaAgregar.agregarEnunciadoEidentificador(1, "Oman");

        respuestaCorrecta.rellenar(opcionesParaAgregar);

        pregunta = new Pregunta(modalidad, enunciado, respuestaCorrecta);

        jugador1 = new Jugador("Santiago");
        jugador2 = new Jugador("Roberto");

        respuestaJugador1 = new RespuestaGroupChoice();
        respuestaJugador2 = new RespuestaGroupChoice();

        opcionesParaAgregarJugador1 = new EnunciadosOpciones();
        opcionesParaAgregarJugador2 = new EnunciadosOpciones();

    }

    @Test
    public void test01seCreaUnaPreguntaGroupChoiceYSeVerificaLaCorrectaAsignacionDePuntos() {

        opcionesParaAgregarJugador1.agregarEnunciadoEidentificador(1, "Israel");
        opcionesParaAgregarJugador1.agregarEnunciadoEidentificador(1, "Oman");
        opcionesParaAgregarJugador1.agregarEnunciadoEidentificador(1, "Yemen");
        opcionesParaAgregarJugador1.agregarEnunciadoEidentificador(0, "Egipto");
        opcionesParaAgregarJugador1.agregarEnunciadoEidentificador(0, "Sudan");
        opcionesParaAgregarJugador1.agregarEnunciadoEidentificador(0, "Yibuti");

        opcionesParaAgregarJugador2.agregarEnunciadoEidentificador(1, "Israel");
        opcionesParaAgregarJugador2.agregarEnunciadoEidentificador(1, "Oman");
        opcionesParaAgregarJugador2.agregarEnunciadoEidentificador(0, "Yemen");
        opcionesParaAgregarJugador2.agregarEnunciadoEidentificador(1, "Egipto");
        opcionesParaAgregarJugador2.agregarEnunciadoEidentificador(0, "Sudan");
        opcionesParaAgregarJugador2.agregarEnunciadoEidentificador(0, "Yibuti");

        respuestaJugador1.rellenar(opcionesParaAgregarJugador1);
        respuestaJugador2.rellenar(opcionesParaAgregarJugador2);

        HashMap<Integer, Respuesta> idJugadores_respuestas = new HashMap<>();

        idJugadores_respuestas.put(1, respuestaJugador1);
        idJugadores_respuestas.put(2, respuestaJugador2);

        Map<Integer, Integer> idsPuntuaciones = pregunta.obtenerPuntajePorJugador(idJugadores_respuestas);

        jugador1.sumarPuntos(idsPuntuaciones.get(1));
        jugador2.sumarPuntos(idsPuntuaciones.get(2));

        assertEquals(jugador1.obtenerPuntaje(), 2);
        assertEquals(jugador2.obtenerPuntaje(), 0);
    }

    @Test
    public void test02seCreaUnaPreguntaGroupChoiceYSeVerificaLaCorrectaAsignacionDePuntos() {

        opcionesParaAgregarJugador1.agregarEnunciadoEidentificador(1, "Israel");
        opcionesParaAgregarJugador1.agregarEnunciadoEidentificador(1, "Oman");
        opcionesParaAgregarJugador1.agregarEnunciadoEidentificador(1, "Yemen");
        opcionesParaAgregarJugador1.agregarEnunciadoEidentificador(0, "Egipto");
        opcionesParaAgregarJugador1.agregarEnunciadoEidentificador(1, "Sudan");
        opcionesParaAgregarJugador1.agregarEnunciadoEidentificador(0, "Yibuti");

        opcionesParaAgregarJugador2.agregarEnunciadoEidentificador(0, "Israel");
        opcionesParaAgregarJugador2.agregarEnunciadoEidentificador(1, "Oman");
        opcionesParaAgregarJugador2.agregarEnunciadoEidentificador(1, "Yemen");
        opcionesParaAgregarJugador2.agregarEnunciadoEidentificador(0, "Egipto");
        opcionesParaAgregarJugador2.agregarEnunciadoEidentificador(0, "Sudan");
        opcionesParaAgregarJugador2.agregarEnunciadoEidentificador(0, "Yibuti");

        respuestaJugador1.rellenar(opcionesParaAgregarJugador1);
        respuestaJugador2.rellenar(opcionesParaAgregarJugador2);

        HashMap<Integer, Respuesta> idJugadores_respuestas = new HashMap<>();

        idJugadores_respuestas.put(1, respuestaJugador1);
        idJugadores_respuestas.put(2, respuestaJugador2);

        Map<Integer, Integer> idsPuntuaciones = pregunta.obtenerPuntajePorJugador(idJugadores_respuestas);

        jugador1.sumarPuntos(idsPuntuaciones.get(1));
        jugador2.sumarPuntos(idsPuntuaciones.get(2));

        assertEquals(jugador1.obtenerPuntaje(), 0);
        assertEquals(jugador2.obtenerPuntaje(), 0);
    }

    @Test
    public void test03seCreaUnaPreguntaGroupChoiceYSeVerificaLaCorrectaAsignacionDePuntos() {

        opcionesParaAgregarJugador1.agregarEnunciadoEidentificador (1, "Israel");
        opcionesParaAgregarJugador1.agregarEnunciadoEidentificador(1, "Oman");
        opcionesParaAgregarJugador1.agregarEnunciadoEidentificador(1, "Yemen");
        opcionesParaAgregarJugador1.agregarEnunciadoEidentificador (0, "Egipto");
        opcionesParaAgregarJugador1.agregarEnunciadoEidentificador(0, "Sudan");
        opcionesParaAgregarJugador1.agregarEnunciadoEidentificador(0, "Yibuti");

        opcionesParaAgregarJugador2.agregarEnunciadoEidentificador (1, "Israel");
        opcionesParaAgregarJugador2.agregarEnunciadoEidentificador(1, "Oman");
        opcionesParaAgregarJugador2.agregarEnunciadoEidentificador(1, "Yemen");
        opcionesParaAgregarJugador2.agregarEnunciadoEidentificador (0, "Egipto");
        opcionesParaAgregarJugador2.agregarEnunciadoEidentificador(0, "Sudan");
        opcionesParaAgregarJugador2.agregarEnunciadoEidentificador(0, "Yibuti");

        respuestaJugador1.rellenar(opcionesParaAgregarJugador1);
        respuestaJugador2.rellenar(opcionesParaAgregarJugador2);

        HashMap<Integer, Respuesta> idJugadores_respuestas = new HashMap<>();

        idJugadores_respuestas.put(1, respuestaJugador1);
        idJugadores_respuestas.put(2, respuestaJugador2);

        Map<Integer, Integer> idsPuntuaciones = pregunta.obtenerPuntajePorJugador(idJugadores_respuestas);

        jugador1.sumarPuntos(idsPuntuaciones.get(1));
        jugador2.sumarPuntos(idsPuntuaciones.get(2));

        assertEquals(jugador1.obtenerPuntaje(), 1);
        assertEquals(jugador2.obtenerPuntaje(), 1);
    }
}