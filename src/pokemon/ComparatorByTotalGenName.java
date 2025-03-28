package pokemon;

import java.util.Comparator;

public class ComparatorByTotalGenName implements Comparator<Pokemon> {
    public int compare(Pokemon p1, Pokemon p2) {
        int totalCompare = Integer.compare(p2.getTotal(), p1.getTotal());
        if (totalCompare != 0) return totalCompare;
        int genCompare = Byte.compare(p1.getGeneration(), p2.getGeneration());
        if (genCompare != 0) return genCompare;
        return p1.getName().compareToIgnoreCase(p2.getName());
    }
}
