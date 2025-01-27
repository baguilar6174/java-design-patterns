package structural.proxy.task;

public class Main {
    public static void main(String[] args) {
        MagicPortalProxy portal = new MagicPortalProxy(new SecretRoom());
        Player player1 = new Player("Bryan", 5);
        Player player2 = new Player("Alexander", 15);
        portal.enter(player1);
        portal.enter(player2);
    }
}
