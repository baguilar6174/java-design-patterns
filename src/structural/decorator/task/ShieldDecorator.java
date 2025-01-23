package structural.decorator.task;

public class ShieldDecorator extends CharacterDecorator {
    public ShieldDecorator(Character character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return this.character.getDescription() + "\n - with shield";
    }

    @Override
    public Stats getStats() {
        Stats stats = this.character.getStats();
        stats.setDefense(stats.getDefense() + 10);
        return stats;
    }
}
