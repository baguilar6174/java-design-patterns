package structural.composite.task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MenuItem salad = new MenuItem("Salad", 12.5);
        MenuItem soup = new MenuItem("Tomato soup", 4.5);
        MenuItem steak = new MenuItem("Steak", 16.99);
        MenuItem soda = new MenuItem("Soda", 2.5);
        MenuItem dessert = new MenuItem("Dessert", 8.45);
        MenuItem coffee = new MenuItem("Coffee", 6.19);

        MenuCategory appetizers = new MenuCategory("Appetizers");
        appetizers.add(salad);
        appetizers.add(soup);

        MenuCategory mainCourse = new MenuCategory("Main Course");
        mainCourse.add(steak);

        MenuCategory beverages = new MenuCategory("Beverages");
        beverages.add(soda);
        beverages.add(coffee);

        MenuCategory desserts = new MenuCategory("Desserts");
        desserts.add(dessert);

        MenuCategory mainMenu = new MenuCategory("Main Menu");
        mainMenu.add(List.of(appetizers, mainCourse, beverages, desserts));

        mainMenu.showDetails("");
    }
}
