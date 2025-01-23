package structural.decorator.task;

public abstract class CharacterDecorator implements Character {

    protected Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }

    @Override
    public String getDescription() {
        return this.character.getDescription();
    }

    @Override
    public Stats getStats() {
        return this.character.getStats();
    }
}
