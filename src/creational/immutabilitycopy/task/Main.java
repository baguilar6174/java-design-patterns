package creational.immutabilitycopy.task;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Bryan", 0, 1);
        System.out.println("\nInitial state:\n");
        player.displayState();

        System.out.println("\nAfter increase score:\n");
        player = player.copyWith(null, 1, null);
        player.displayState();

        System.out.println("\nAfter increase level:\n");
        player = player.copyWith(null, null, 2);
        player.displayState();

        System.out.println("\nAfter change player name:\n");
        player = player.copyWith("Alexander", null, null);
        player.displayState();
    }
}
