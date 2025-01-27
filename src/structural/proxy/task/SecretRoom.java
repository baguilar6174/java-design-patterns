package structural.proxy.task;

public class SecretRoom implements Room {
    @Override
    public void enter(Player player) {
        System.out.printf("%nWelcome to secret room player %s%n", player.name());
    }
}
