package structural.flyweight.task;

public class Bullet {
    private final int x;
    private final int y;
    private final int direction;
    private final BulletType bulletType;

    public Bullet(int x, int y, int direction, BulletType bulletType) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.bulletType = bulletType;
    }

    public void display() {
        System.out.printf(
                "%nBullet type: %s%nCoordinates: (%d, %d)%nDirection: %d%nDamage: %d%nColor: %s%n",
                this.bulletType.getName(),
                this.x,
                this.y,
                this.direction,
                this.bulletType.getDamage(),
                this.bulletType.getColor()
        );
    }
}
