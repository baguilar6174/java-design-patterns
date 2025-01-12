package creational.sigleton.task;

public class Main {
    public static void main(String[] args) {
        DragonBalls dragonBalls = DragonBalls.getInstance();

        dragonBalls.collectBall();
        dragonBalls.collectBall();
        dragonBalls.collectBall();

        dragonBalls.summonShenlong();

        DragonBalls dragonBalls2 = DragonBalls.getInstance();

        dragonBalls2.collectBall();
        dragonBalls2.collectBall();
        dragonBalls2.collectBall();
        dragonBalls2.collectBall();

        dragonBalls.summonShenlong();

        dragonBalls2.summonShenlong();
    }
}
