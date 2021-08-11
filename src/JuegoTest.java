import atributos.Atributo;
import atributos.AtributoSimple;
import competidores.Personaje;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JuegoTest {

    Juego juego;

    @Before
    public void setUp() throws Exception {
        juego = new Juego();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addPersonajeTest() {
        Personaje personajeTest = new Personaje("NombrePersonajeTest", "NombrePersonajeFantasiaTest");
        juego.addEnfrentable(personajeTest);
        assertEquals(1, juego.getEnfrentables().size());
    }

    @Test
    public void addAtributoSimpleTest(){
        AtributoSimple atributoTest = new AtributoSimple(200);
        Personaje personajeTest = new Personaje("NombrePersonajeTest", "NombrePersonajeFantasiaTest");
        personajeTest.addAtributo("atributoTest", atributoTest);
        assertEquals(200, atributoTest.getValor(personajeTest), 0.0);
    }
}