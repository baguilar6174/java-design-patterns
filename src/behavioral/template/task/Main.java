package behavioral.template.task;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cleaning a hotel room:");
        RoomCleaning hotelRoom = new HotelRoomCleaning();
        hotelRoom.cleanRoom();

        System.out.println("Cleaning a conference room:");
        RoomCleaning conferenceRoom = new ConferenceRoomCleaning();
        conferenceRoom.cleanRoom();

        System.out.println("Cleaning an office:");
        RoomCleaning office = new OfficeCleaning();
        office.cleanRoom();
    }
}

