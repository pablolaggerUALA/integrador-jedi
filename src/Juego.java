import competidores.Enfrentable;
import competidores.Personaje;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Juego {
    private List<Enfrentable> enfrentables = new ArrayList<>();

    public Juego(){}

    public List<Enfrentable> getEnfrentables() {
        return enfrentables;
    }

    public void setEnfrentables(ArrayList<Enfrentable> enfrentables) {
        this.enfrentables = enfrentables;
    }

    public List<Enfrentable> getQuienesVencen(Enfrentable e, Comparator c){

    }

    public Enfrentable enfrentar(Enfrentable e1, Enfrentable e2){

    }

    public boolean addEnfrentable(Enfrentable e){
        return this.enfrentables.add(e);

    }

    public List<Personaje> ordenarPersonajes(Comparator c){
    }


}
