package atributos.operacion;

import competidores.Enfrentable;
import atributos.Atributo;

public abstract class AtributoOperacion implements Atributo {
    protected String key1;
    protected String key2;

    public AtributoOperacion(String key1, String key2) {
        this.key1 = key1;
        this.key2 = key2;
    }

    @Override
    public abstract float getValor(Enfrentable e);
}
