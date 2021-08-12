import atributos.Atributo;
import atributos.AtributoSimple;
import atributos.operacion.AtributoMultiplicacion;
import comparator.ComparatorCompuesto;
import comparator.ComparatorCriterioSimple;
import comparator.ComparatorNombre;
import competidores.Enfrentable;
import competidores.Liga;
import competidores.Personaje;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Instanciamiento de atributos

        Atributo velocidadP1 = new AtributoSimple(20);
        Atributo fuerzaP2 = new AtributoSimple(5);
        Atributo velocidadP2 = new AtributoSimple(10);

        ComparatorNombre comparator = new ComparatorNombre();
        ComparatorCriterioSimple comparatorSimple = new ComparatorCriterioSimple("fuerza");
        ComparatorCriterioSimple comparatorSimpleOperacional = new ComparatorCriterioSimple("fuerzaVelocidad");
        //ComparatorCompuesto comparatorCompuesto = new ComparatorCompuesto();
        //comparatorCompuesto.addComparadorCompuesto(comparator);
        //comparatorCompuesto.addComparadorCompuesto(comparatorSimple,1);

        //Instanciamiento de personajes
        Personaje p1 = new Personaje("NombrePersonaje1", "NombreFantasiaPersonaje1");
        Personaje p2 = new Personaje("NombrePersonaje2", "NombreFantasiaPersonaje2");
        Personaje p4 = new Personaje("asdf", "NombreFanasdfasdftasiaPersonaje2");
        Personaje p3 = new Personaje("NombrePersonaje3", "NombreFantasiaPersonaje3");

        p1.addAtributo("fuerza", new AtributoSimple(10));
        p1.addAtributo("velocidad", velocidadP1);
        p1.addAtributo("fuerzaVelocidad", new AtributoMultiplicacion("fuerza", "velocidad"));
        p2.addAtributo("fuerza", new AtributoSimple(5));
        p2.addAtributo("velocidad", velocidadP2);

        Juego juego = new Juego();
        juego.addEnfrentable(p1);
        juego.addEnfrentable(p2);
        juego.addEnfrentable(p4);
        juego.addEnfrentable(p3);

        System.out.println("\nMostramos los personajes ordenados del objeto Juego");
        List<Personaje> enfrentables = juego.ordenarPersonajes(comparator);
        for (Personaje e : enfrentables) {
            System.out.println(e.getNombre());
        }

        //Creando ligas
        Liga l1 = new Liga("NombreLiga1", "NombreFantasiaLiga1");
        l1.addIntegrante(p1);
        l1.addIntegrante(p2);


        System.out.println("\nMostramos los personajes de una liga ");
        List<Personaje> personajesDeLiga = l1.getPersonajes();
        for (Personaje p : personajesDeLiga) {
            System.out.println(p.getNombre());
        }

        try {
            System.out.println("\nGanador por ComparatorNombre juego: " + juego.enfrentar(p1, p2, comparator).getNombre());
            System.out.println("\nGanador por ComparatorNombre: " + p1.enfrentar(p2, comparator).getNombre());
            System.out.println("Ganador por ComparatorNombre: " + p2.enfrentar(p1, comparator).getNombre());
            System.out.println("Ganador por ComparatorCriterioSimple: " + p2.enfrentar(p1, comparatorSimple).getNombre());
            System.out.println("Ganador por ComparatorSimpleOperacional: " + p2.enfrentar(p1, new ComparatorCriterioSimple("fuerzaVelocidad")).getNombre());
        } catch (Exception e) {
            System.out.println("Fallo " + e.getMessage());
        }

        //System.out.println("Ganador por ComparatorCompuesto: " + p2.enfrentar(p1, comparatorCompuesto).getNombre());

    }
}
