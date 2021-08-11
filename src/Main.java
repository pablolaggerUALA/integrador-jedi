import comparator.Comparator;
import comparator.ComparatorCriterioSimple;
import comparator.ComparatorNombre;
import competidores.Enfrentable;
import competidores.Liga;
import competidores.Personaje;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ComparatorNombre comparatorNombre = new ComparatorNombre();
        Juego juego = new Juego();
        Personaje p1 = new Personaje("NombrePersonaje1", "NombreFantasiaPersonaje1");
        Personaje p2 = new Personaje("NombrePersonaje2", "NombreFantasiaPersonaje2");
        Personaje p3 = new Personaje("NombrePersonaje3", "NombreFantasiaPersonaje3");
        juego.addEnfrentable(p1);
        juego.addEnfrentable(p2);
        juego.ordenarPersonajes(comparatorNombre);

        //juego.ordenarPersonajes(comparatorNombre);
        List<Enfrentable> enfrentables = juego.getEnfrentables();
        for (Enfrentable e : enfrentables) {
            System.out.println(e.getNombre()
            );
        }

        //Creando ligas
        Liga l1 = new Liga("NombreLiga1", "NombreFantasiaLiga1");
        l1.addIntegrante(p1);
        l1.addIntegrante(p2);

    }
}
