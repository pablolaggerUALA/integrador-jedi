package atributos;

import competidores.Enfrentable;
import interfaces.Atributo;

public class AtributoSimple implements Atributo {
    private float value;

    public AtributoSimple(float value) { this.value = value; }

    @Override
    public float getValor(Enfrentable e) { return value; }
}
