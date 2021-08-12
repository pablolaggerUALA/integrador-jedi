package comparator;

import competidores.Enfrentable;
import java.util.*;

public class ComparatorNombre implements Comparator<Enfrentable> {

    @Override
    public int compare(Enfrentable e1, Enfrentable e2) {
        return Integer.compare(e1.getNombre().length(), e2.getNombre().length());
    }


}
