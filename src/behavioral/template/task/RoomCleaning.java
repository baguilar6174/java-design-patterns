package behavioral.template.task;

// Base Class - RoomCleaning
abstract class RoomCleaning {
    // Template method: defines the general flow
    public final void cleanRoom() {
        enterRoom();
        collectTrash();
        specificCleaning(); // This method must be implemented
        disinfectSurfaces();
        exitRoom();

        System.out.println("Cleaning finished.\n");
    }

    // Common steps
    private void enterRoom() {
        System.out.println("Entering the room...");
    }

    private void collectTrash() {
        System.out.println("Collecting trash...");
    }

    private void disinfectSurfaces() {
        System.out.println("Disinfecting surfaces...");
    }

    private void exitRoom() {
        System.out.println("Leaving the room and marking it as clean.");
    }

    protected abstract void specificCleaning();
}
