package comparator;

import competidores.Enfrentable;

public class ComparatorCriterioSimple implements Comparator<Enfrentable>{
    private String atributo;

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }


    @Override
    public int compare(Enfrentable e1, Enfrentable e2) {
        return 0;
    }
}
