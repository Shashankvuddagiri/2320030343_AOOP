package restaurant;

import java.util.Collections;

public class RestaurantMenuSystem {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.addItem(new MenuItem("Pasta", 12.50, "Main Course"));
        menu.addItem(new MenuItem("Soup", 6.00, "Starter"));
        menu.addItem(new MenuItem("Salad", 7.50, "Appetizer"));
        menu.addItem(new MenuItem("Pizza", 10.00, "Main Course"));

        System.out.println("Original Menu:");
        for (MenuItem item : menu) {
            System.out.println(item);
        }

        // Sorting by price using Comparable
        Collections.sort(menu.getItems());
        System.out.println("\nSorted by Price:");
        for (MenuItem item : menu) {
            System.out.println(item);
        }

        // Sorting by name using NameComparator
        Collections.sort(menu.getItems(), new NameComparator());
        System.out.println("\nSorted by Name:");
        for (MenuItem item : menu) {
            System.out.println(item);
        }

        // Sorting by category using CategoryComparator
        Collections.sort(menu.getItems(), new CategoryComparator());
        System.out.println("\nSorted by Category:");
        for (MenuItem item : menu) {
            System.out.println(item);
        }

        // Cloning a menu item
        try {
            MenuItem clonedItem = (MenuItem) menu.getItems().get(0).clone();
            System.out.println("\nCloned Item: " + clonedItem);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
