package restaurant;

public class MenuItem implements Comparable<MenuItem>, Cloneable {
    private String name;
    private double price;
    private String category;

    public MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public int compareTo(MenuItem other) {
        return Double.compare(this.price, other.price); // Compare by price
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return name + " (" + category + ") - $" + price;
    }
}
