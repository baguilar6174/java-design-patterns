package structural.decorator.task;

public class HelmetDecorator extends  CharacterDecorator {
    public HelmetDecorator(Character character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return this.character.getDescription() + "\n - with helmet";
    }

    @Override
    public Stats getStats() {
        Stats stats = this.character.getStats();
        stats.setDefense(stats.getDefense() + 5);
        return stats;
    }
}
