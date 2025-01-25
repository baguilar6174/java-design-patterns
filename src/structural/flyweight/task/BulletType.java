package structural.flyweight.task;

public class BulletType {
    private final String name;
    private final int damage;
    private final String color;

    public BulletType(String name, int damage, String color) {
        this.name = name;
        this.damage = damage;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public String getColor() {
        return color;
    }
}
