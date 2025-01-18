package structural.bridge.task;

public class Main {
    public static void main(String[] args) {
        Character warrior = new Warrior(new SwordAttack());
        warrior.performAbility();
        warrior.setAbility(new AxeAttack());
        warrior.performAbility();
        Character mage = new Mage(new MagicSpell());
        mage.performAbility();
    }
}
