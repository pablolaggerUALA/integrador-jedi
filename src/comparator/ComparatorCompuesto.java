package comparator;

import competidores.Enfrentable;

import java.util.ArrayList;

public class ComparatorCompuesto {
    private ArrayList<Comparator> comparators;

    public ArrayList<Comparator> getComparators() {
        return comparators;
    }

    public void setComparators(ArrayList<Comparator> comparators) {
        this.comparators = comparators;
    }

    public ComparatorCompuesto(ArrayList<Comparator> comparators) {
        this.comparators = comparators;
    }

    public void ComparadorCompuesto(){};

    public void ComparadorCompuesto(ArrayList comparators){};

    public boolean AddComparadorCompuesto(Comparator c){
        return this.AddComparadorCompuesto(c);

    }

    public boolean AddComparadorCompuesto(Comparator c,int index){
        return this.AddComparadorCompuesto(c,index);

    }


}
