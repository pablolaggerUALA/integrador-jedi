package comparator;

import competidores.Enfrentable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ComparatorCompuesto implements Comparator<Enfrentable> {
    private List<Comparator<Enfrentable>> comparators;

    public void ComparadorCompuesto() {
        this.comparators = new ArrayList<>();
    }

    public void ComparadorCompuesto(List<Comparator<Enfrentable>> comparators) {
        this.comparators = new ArrayList<>(comparators);
    }

    public boolean addComparadorCompuesto(Comparator<Enfrentable> c) {
        return comparators.add(c);
    }

    public boolean addComparadorCompuesto(Comparator<Enfrentable> c, int index) {
        comparators.add(index, c);
        return true;
    }

    @Override
    public int compare(Enfrentable e1, Enfrentable e2) {
        for (Comparator<Enfrentable> c : comparators)
            return c.compare(e1, e2);
        return 0;
    }
}
