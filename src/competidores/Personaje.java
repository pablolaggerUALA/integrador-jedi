package competidores;

import atributos.Atributo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Personaje extends Enfrentable {
    Map<String, Atributo> atributos = new HashMap<String, Atributo>();

    public Personaje(String nombre, String nombreFantasia) {
        super(nombre, nombreFantasia);
    }

    public boolean addAtributo(String k, Atributo a) {
        atributos.put(k, a);
        return true;
    }

    @Override
    public float getValorAtributo(String key) {
        for (String k : atributos.keySet()) {
            if (k.equals(key)) return atributos.get(k).getValor(this);
        }
        return 0; //caso cuando no encuentra el valor solicitado.
    }

    @Override
    public List<Personaje> getPersonajes() {
        List<Personaje> personaje = new ArrayList<>();
        personaje.add(this);
        return personaje;
    }
}
