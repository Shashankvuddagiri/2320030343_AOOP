package restaurant;

import java.util.Comparator;

public class PriceComparator implements Comparator<MenuItem> {
    @Override
    public int compare(MenuItem item1, MenuItem item2) {
        return Double.compare(item1.getPrice(), item2.getPrice());
    }
}
