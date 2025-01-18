package structural.bridge.task;

public class Mage extends Character {

    public Mage(Ability ability) {
        super(ability);
    }

    @Override
    public void performAbility() {
        System.out.println("\nMage is ready to fight!");
        this.ability.use();
    }
}
