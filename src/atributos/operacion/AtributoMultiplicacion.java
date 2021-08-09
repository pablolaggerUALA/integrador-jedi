package atributos.operacion;

import competidores.Enfrentable;

public class AtributoMultiplicacion extends AtributoOperacion{
    public AtributoMultiplicacion(String key1, String key2) { super(key1, key2); }

    @Override
    public float getValor(Enfrentable e) {
        return e.getValorAtributo(key1) * e.getValorAtributo(key2);
    }
}
