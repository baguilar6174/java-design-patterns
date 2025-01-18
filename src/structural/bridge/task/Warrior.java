package structural.bridge.task;

public class Warrior extends Character {

    public Warrior(Ability ability) {
        super(ability);
    }

    @Override
    public void performAbility() {
        System.out.println("\nWarrior is ready to fight!");
        this.ability.use();
    }
}
