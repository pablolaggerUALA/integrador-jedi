package comparator;

import competidores.Enfrentable;

public class ComparatorCriterioSimple implements Comparator<Enfrentable> {
    private String atributo;

    public ComparatorCriterioSimple(String atributo) { this.atributo = atributo; }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    @Override
    public int compare(Enfrentable e1, Enfrentable e2) {
        float atr1 = e1.getValorAtributo(atributo);
        float atr2 = e2.getValorAtributo(atributo);
        return Float.compare(atr1, atr2);
    }
}
