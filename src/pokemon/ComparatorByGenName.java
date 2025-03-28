package pokemon;

import java.util.Comparator;

public class ComparatorByGenName implements Comparator<Pokemon> {
    public int compare(Pokemon p1, Pokemon p2) {
        int genCompare = Byte.compare(p1.getGeneration(), p2.getGeneration());
        return (genCompare != 0) ?
                genCompare :
                p1.getName().compareToIgnoreCase(p2.getName());
    }
}
