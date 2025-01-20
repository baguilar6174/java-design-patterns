package structural.composite.task;

public class MenuItem implements MenuComponent {

    private final String name;
    private final double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showDetails(String indent) {
        System.out.printf("%s - %s: %f%n", indent, this.name, this.price);
    }
}
