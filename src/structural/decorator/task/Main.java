package structural.decorator.task;

public class Main {

    public static void main(String[] args) {
        Character character = new BasicCharacter();
        System.out.println(character.getDescription());
        System.out.println(character.getStats());

        character = new HelmetDecorator(character);
        System.out.println(character.getDescription());
        System.out.println(character.getStats());

        character = new ShieldDecorator(character);
        System.out.println(character.getDescription());
        System.out.println(character.getStats());

        character = new SwordDecorator(character);
        System.out.println(character.getDescription());
        System.out.println(character.getStats());
    }
}
