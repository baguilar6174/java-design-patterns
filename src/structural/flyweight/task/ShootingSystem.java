package structural.flyweight.task;

import java.util.ArrayList;
import java.util.List;

public class ShootingSystem {
    private final List<Bullet> bullets = new ArrayList<>();
    private final BulletTypeFactory factory;

    public ShootingSystem(BulletTypeFactory factory) {
        this.factory = factory;
    }

    public void shoot(int x, int y, int direction, String type, int damage, String color) {
        BulletType bulletType = factory.getBulletType(type, damage, color);
        Bullet bullet = new Bullet(x, y, direction, bulletType);
        bullets.add(bullet);
        bullet.display();
    }

    public int getBulletCount() {
        return bullets.size();
    }
}
