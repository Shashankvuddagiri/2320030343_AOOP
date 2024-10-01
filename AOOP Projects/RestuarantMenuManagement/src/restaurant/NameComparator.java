package restaurant;

import java.util.Comparator;

public class NameComparator implements Comparator<MenuItem> {
    @Override
    public int compare(MenuItem item1, MenuItem item2) {
        return item1.getName().compareTo(item2.getName());
    }
}
