import comparator.Comparator;
import competidores.Enfrentable;
import competidores.Personaje;

import java.util.*;

public class Juego {
    private List<Enfrentable> enfrentables = new ArrayList<>();

    public Juego() {
    }

    public List<Enfrentable> getEnfrentables() {
        return enfrentables;
    }

    public void setEnfrentables(ArrayList<Enfrentable> enfrentables) {
        this.enfrentables = enfrentables;
    }

    public List<Enfrentable> getQuienesVencen(Enfrentable e, Comparator<Enfrentable> c) {
        return null;
    }

    public Enfrentable enfrentar(Enfrentable e1, Enfrentable e2, Comparator<Enfrentable> c) {
        if (e1.getValorAtributo("key1") < e2.getValorAtributo("key2"))
            return e1;
        else
            return e2;
    }

    public boolean addEnfrentable(Enfrentable e) {
        return enfrentables.add(e);
    }

    public List<Personaje> ordenarPersonajes(Comparator<Enfrentable> c) {
        return enfrentables.stream().toList();
    }
}
