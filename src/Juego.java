import java.util.Comparator;
import competidores.Enfrentable;
import competidores.Personaje;

import java.util.*;

public class Juego {
    private List<Enfrentable> enfrentables;

    public void setEnfrentables(List<Enfrentable> enfrentables) {
        this.enfrentables = enfrentables;
    }

    public Juego() {
        enfrentables = new ArrayList<>();
    }

    public List<Enfrentable> getEnfrentables() {
        return enfrentables;
    }

    public List<Enfrentable> getQuienesVencen(Enfrentable e, Comparator c) {
        return null;
    }

    public Enfrentable enfrentar(Enfrentable e1, Enfrentable e2, Comparator c) {
        int ganador = c.compare(e1, e2);
        if (ganador > 0){
            return e1;
        } else if (ganador == 0){
            System.out.println("Hubo empate");
            return null;
        } else
            return e2;
    }

    public boolean addEnfrentable(Enfrentable e) {
        return enfrentables.add(e);
    }

    public List<Personaje> ordenarPersonajes(Comparator comparator) {
        List<Personaje> personajes = new ArrayList<>();
        getEnfrentables().forEach(e -> personajes.addAll(e.getPersonajes()));
        personajes.sort(comparator);
        return personajes;
    }
}
