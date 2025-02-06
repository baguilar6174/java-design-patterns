package behavioral.template.task;

// Subclass - ConferenceRoomCleaning
class ConferenceRoomCleaning extends RoomCleaning {
    @Override
    protected void specificCleaning() {
        System.out.println("Cleaning tables and arranging chairs.");
    }
}
