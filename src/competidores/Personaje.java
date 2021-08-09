package competidores;

import interfaces.Atributo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Personaje extends Enfrentable {
    Map<String, Atributo> atributos = new HashMap<String, Atributo>();

    public Personaje(String nombre, String nombreFantasia) {
        super(nombre, nombreFantasia);
    }

    @Override
    public float getValorAtributo(String key) {
        /*
         Map<Integer, String> atributo = atributos.entrySet()
                .stream().filter(x->x.getKey().equals(key))
                .collect(Collectors.toCollection());
         */
       return 0;
    }

    @Override
    protected List<Personaje> getPersonajes() {
        return null;
    }
}
