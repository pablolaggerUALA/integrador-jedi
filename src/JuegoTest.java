import competidores.Personaje;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JuegoTest {
    Juego juego;

    @Before
    public void setup() {
        juego = new Juego();
    }

    @Test
    public void addPersonajeTest() {
        Personaje personajeTest = new Personaje("NombrePersonajeTest", "NombrePersonajeFantasiaTest");
        juego.addEnfrentable(personajeTest);
        assertEquals(1, juego.getEnfrentables().size());
    }

}