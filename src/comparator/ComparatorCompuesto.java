package comparator;

import competidores.Enfrentable;

import java.util.*;

public class ComparatorCompuesto implements Comparator<Enfrentable> {
    private List<Comparator<Enfrentable>> comparators;

    public void ComparadorCompuesto() {
        this.comparators = new ArrayList<>();
    }

    public void ComparadorCompuesto(List<Comparator<Enfrentable>> comparators) {
        this.comparators = new ArrayList<>(comparators);
    }

    public boolean addComparadorCompuesto(Comparator<Enfrentable> c) {
        if (c != null)
            return comparators.add(c);
        else return false;
    }

    public boolean addComparadorCompuesto(Comparator<Enfrentable> c, int index) {
        if (c != null){
            comparators.add(index, c);
            return true;
        }
        return false;
    }

    @Override
    public int compare(Enfrentable e1, Enfrentable e2) {
        for (Comparator<Enfrentable> c : comparators) {
            int x = c.compare(e1, e2);
            if (x != 0) return x;
        }
        return 0;
    }
}
