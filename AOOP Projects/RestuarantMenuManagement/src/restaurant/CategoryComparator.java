package restaurant;

import java.util.Comparator;

public class CategoryComparator implements Comparator<MenuItem> {
    @Override
    public int compare(MenuItem item1, MenuItem item2) {
        return item1.getCategory().compareTo(item2.getCategory());
    }
}
