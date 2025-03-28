package pokemon;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Pokemon> {
    public int compare(Pokemon p1, Pokemon p2) {
        return p1.getName().compareToIgnoreCase(p2.getName());
    }
}
