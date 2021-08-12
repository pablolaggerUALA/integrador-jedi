import atributos.Atributo;
import atributos.AtributoSimple;
import atributos.operacion.AtributoMultiplicacion;
import atributos.operacion.AtributoSuma;
import comparator.ComparatorCriterioSimple;
import comparator.ComparatorNombre;
import competidores.Personaje;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JuegoTest {

    Juego juego;
    Personaje personajeTest;

    @Before
    public void setUp() throws Exception {
        juego = new Juego();
        personajeTest = new Personaje("NombrePersonajeTest", "NombrePersonajeFantasiaTest");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addPersonajeTest() {
        juego.addEnfrentable(personajeTest);
        assertEquals(1, juego.getEnfrentables().size());
    }

    @Test
    public void addAtributoSimpleTest() {
        AtributoSimple atributoTest = new AtributoSimple(200);
        personajeTest.addAtributo("atributoTest", atributoTest);
        assertEquals(200, atributoTest.getValor(personajeTest), 0.0);
    }

    @Test
    public void addAtributoOperacionTest() {
        Atributo fuerzaTest = new AtributoSimple(10);
        Atributo velocidadTest = new AtributoSimple(20);
        AtributoMultiplicacion atrOpTest1 = new AtributoMultiplicacion("fuerzaTest", "velocidadTest");

        personajeTest.addAtributo("fuerzaTest", fuerzaTest);
        personajeTest.addAtributo("velocidadTest", velocidadTest);
        personajeTest.addAtributo("fuerzaVelocidad", atrOpTest1);
        assertEquals(200, personajeTest.getValorAtributo("fuerzaVelocidad"),0.0);
    }
}