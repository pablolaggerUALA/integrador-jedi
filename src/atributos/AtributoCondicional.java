package atributos;

import competidores.Enfrentable;
import interfaces.Atributo;

public class AtributoCondicional implements Atributo {
    private String key1;
    private String key2;
    private Atributo keyThen;
    private Atributo keyElse;

    public AtributoCondicional(String key1, String key2, Atributo keyThen, Atributo keyElse) {
        this.key1 = key1;
        this.key2 = key2;
        this.keyThen = keyThen;
        this.keyElse = keyElse;
    }

    @Override
    public float getValor(Enfrentable e) {
        if (e.getValorAtributo(key1) > e.getValorAtributo(key2))
            return keyThen == null ? 0 : keyThen.getValor(e);
        return keyElse == null ? 0 : keyElse.getValor(e);
    }
}
