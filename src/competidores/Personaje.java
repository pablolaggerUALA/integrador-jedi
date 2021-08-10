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
        for(String k:atributos.keySet()){
            if (k.equals(key)) return atributos.get(k).getValor(this);
        }
        return 0; //caso cuando no encuentra el valor solicitado.
    }

    @Override
    protected List<Personaje> getPersonajes() {
        return (List<Personaje>) this;
    }
}
