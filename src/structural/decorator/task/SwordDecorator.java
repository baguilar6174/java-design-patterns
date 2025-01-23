package structural.decorator.task;

public class SwordDecorator extends CharacterDecorator {
    public SwordDecorator(Character character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return this.character.getDescription() + "\n - with sword";
    }

    @Override
    public Stats getStats() {
        Stats stats = this.character.getStats();
        stats.setAttack(stats.getAttack() + 7);
        return stats;
    }
}
