package competidores;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.reducing;

public class Liga extends Enfrentable {
    private List<Enfrentable> integrantes;

    public Liga(String nombre, String nombreFantasia, List<Enfrentable> integrantes) {
        super(nombre, nombreFantasia);
        this.integrantes = integrantes;
    }

    public Liga(String nombre, String nombreFantasia) {
        super(nombre, nombreFantasia);
        this.integrantes = new ArrayList<Enfrentable>();
    }

    @Override
    public float getValorAtributo(String key) {
        float valor = 0;
        for (Enfrentable e : integrantes) valor += e.getValorAtributo(key);
        return valor;
    }

    @Override
    protected List<Personaje> getPersonajes() {
        return null;
    }

    public List<Enfrentable> getIntegrantes() {
        return integrantes;
    }

    public void addIntegrante(Enfrentable e) {
        this.integrantes.add(e);
    }

    public void deleteIntegrante(Enfrentable e) {
        this.integrantes.remove(e);
    }
}
