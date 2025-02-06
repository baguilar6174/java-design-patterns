package behavioral.template.task;

// Subclass - HotelRoomCleaning
class HotelRoomCleaning extends RoomCleaning {
    @Override
    protected void specificCleaning() {
        System.out.println("Making beds and replenishing bathroom items.");
    }
}
