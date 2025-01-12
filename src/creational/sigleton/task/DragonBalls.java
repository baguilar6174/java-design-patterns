package creational.sigleton.task;

public class DragonBalls {

    private static DragonBalls instance;
    private int ballsCollected;

    private DragonBalls() {
        this.ballsCollected = 0;
    }

    public static DragonBalls getInstance() {
        if (DragonBalls.instance == null) {
            DragonBalls.instance = new DragonBalls();
            System.out.println("Dragon balls created!!");
        }
        return DragonBalls.instance;
    }

    public void collectBall() {
        if (this.ballsCollected < 7) {
            this.ballsCollected ++;
            System.out.printf("Dragon ball collected!! Total: %d%n", this.ballsCollected);
            return;
        }
        System.out.println("The balls have already been collected!");
    }

    public void summonShenlong() {
        if (this.ballsCollected == 7) {
            System.out.println("Shenlong has been summoned!");
            this.ballsCollected = 0;
            return;
        }
        System.out.printf("There are still %d spheres to be collected!!%n", 7 - this.ballsCollected);
    }
}
