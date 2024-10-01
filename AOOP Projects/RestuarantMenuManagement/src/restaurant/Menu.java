package restaurant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu implements Iterable<MenuItem> {
    private List<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public List<MenuItem> getItems() {
        return items;
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return items.iterator();
    }
}
