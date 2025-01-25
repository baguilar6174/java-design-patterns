package structural.flyweight.task;

import java.util.HashMap;
import java.util.Map;

public class BulletTypeFactory {

    private final Map<String, BulletType> bullets = new HashMap<>(); // Cache for storing created bullets

    public BulletType getBulletType(String name, int damage, String color) {
        String key = name + "-" + damage + "-" + color;
        if (!this.bullets.containsKey(key)) {
            System.out.printf("%nCreating %s instance....%n", key);
            this.bullets.put(key, new BulletType(name, damage, color));
        }
        return bullets.get(key);
    }
}
