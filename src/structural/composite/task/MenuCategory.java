package structural.composite.task;

import java.util.ArrayList;
import java.util.List;

public class MenuCategory implements MenuComponent {

    private final String name;
    private final List<MenuComponent> items = new ArrayList<>();

    public MenuCategory(String name) {
        this.name = name;
    }

    public void add(MenuComponent item) {
        this.items.add(item);
    }

    public void add(List<MenuComponent> items) {
        this.items.addAll(items);
    }

    @Override
    public void showDetails(String indent) {
        System.out.printf("%s - %s:%n", indent, this.name);
        this.items.forEach(item -> item.showDetails(indent + " "));
    }
}
