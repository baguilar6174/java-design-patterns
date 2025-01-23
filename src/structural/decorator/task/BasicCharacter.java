package structural.decorator.task;

public class BasicCharacter implements Character {
    @Override
    public String getDescription() {
        return "\nBasic Character";
    }

    @Override
    public Stats getStats() {
        return new Stats(10,10);
    }
}
