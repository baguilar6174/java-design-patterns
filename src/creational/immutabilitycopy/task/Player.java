package creational.immutabilitycopy.task;

public class Player {
    public final String name;
    public final Integer score;
    public final Integer level;

    public Player(String name, Integer score, Integer level) {
        this.name = name;
        this.score = score;
        this.level = level;
    }

    public Player copyWith(String name, Integer score, Integer level) {
        return new Player(
                name != null ? name : this.name,
                score != null ? score : this.score,
                level != null ? level : this.level
        );
    }

    public void displayState() {
        System.out.printf(
                "Player State%n Name: %s%n Score: %d%n Level: %d%n",
                this.name, this.score, this.level
        );
    }
}
