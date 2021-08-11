import comparator.Comparator;
import competidores.Enfrentable;
import competidores.Personaje;

import java.util.*;
import java.util.stream.Collectors;

public class Juego {
    private List<Enfrentable> enfrentables = new ArrayList<>();

    public Juego() {
    }

    public List<Enfrentable> getEnfrentables() {
        return enfrentables;
    }

    public List<Enfrentable> getQuienesVencen(Enfrentable e, Comparator c) {
        return null;
    }

    public Enfrentable enfrentar(Enfrentable e1, Enfrentable e2, Comparator c) {
        c.compare(e1, e2);
        if (e1.getValorAtributo("key1") < e2.getValorAtributo("key2"))
            return e1;
        else
            return e2;
    }

    public boolean addEnfrentable(Enfrentable e) {
        return enfrentables.add(e);
    }

    public List<Personaje> ordenarPersonajes(Comparator c) {
        List<Personaje> personajes = new ArrayList<Personaje>();
        getEnfrentables().forEach(e -> personajes.addAll(e.getPersonajes()));
        //personajes.sort(c);
        return personajes;
    }
}
