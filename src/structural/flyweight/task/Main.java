package structural.flyweight.task;

public class Main {
    public static void main(String[] args) {
        BulletTypeFactory factory = new BulletTypeFactory();
        ShootingSystem shootingSystem = new ShootingSystem(factory);

        shootingSystem.shoot(10, 20, 0, "gun", 10, "gray");
        shootingSystem.shoot(15, 25, 90, "shotgun", 20, "red");
        shootingSystem.shoot(20, 30, 180, "rifle", 15, "green");
        shootingSystem.shoot(10, 20, 45, "gun", 10, "gray");
        shootingSystem.shoot(25, 35, 270, "shotgun", 20, "red");

        System.out.printf("%nTotal: %d", shootingSystem.getBulletCount());
    }
}
