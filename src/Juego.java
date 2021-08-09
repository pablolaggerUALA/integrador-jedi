import comparator.Comparator;
import competidores.Enfrentable;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    private ArrayList<Enfrentable> enfrentables = new ArrayList<>();

    public Juego(ArrayList<Enfrentable> enfrentables) {
        this.enfrentables = enfrentables;
    }

    public ArrayList<Enfrentable> getEnfrentables() {
        return enfrentables;
    }

    public void setEnfrentables(ArrayList<Enfrentable> enfrentables) {
        this.enfrentables = enfrentables;
    }



}
