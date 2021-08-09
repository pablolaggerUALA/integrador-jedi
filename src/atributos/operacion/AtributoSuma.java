package atributos.operacion;

import competidores.Enfrentable;

public class AtributoSuma extends AtributoOperacion {
    public AtributoSuma(String key1, String key2) {
        super(key1, key2);
    }

    @Override
    public float getValor(Enfrentable e) {
        return e.getValorAtributo(key1) + e.getValorAtributo(key2);
    }
}
