package structural.proxy.task;

public class MagicPortalProxy implements Room {

    private final Room secretRoom;

    public MagicPortalProxy(Room secretRoom) {
        this.secretRoom = secretRoom;
    }

    @Override
    public void enter(Player player) {
        if (player.level() >= 10) {
            this.secretRoom.enter(player);
            return;
        }
        System.out.printf("%nPlayer %s, your level %d is so slow!%n", player.name(), player.level());
    }
}
