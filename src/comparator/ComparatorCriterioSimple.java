package comparator;

import competidores.Enfrentable;

import java.util.Comparator;
import java.util.Locale;

public class ComparatorCriterioSimple implements Comparator<Enfrentable> {
    private String atributo;

    public ComparatorCriterioSimple(String atributo) {
        this.atributo = atributo;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    @Override
    public int compare(Enfrentable e1, Enfrentable e2) {
        System.out.println("\nLa comparacion se realiza con el atributo: " + getAtributo().toUpperCase() + " donde " + e1.getNombre() + " posee:" + e1.getValorAtributo(getAtributo()) + " y " + e2.getNombre() + " posee:" + e2.getValorAtributo(getAtributo()));
        float atr1 = e1.getValorAtributo(getAtributo());
        float atr2 = e2.getValorAtributo(getAtributo());
        return Float.compare(atr1, atr2);
    }
}
