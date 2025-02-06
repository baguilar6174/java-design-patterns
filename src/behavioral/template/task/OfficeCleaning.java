package behavioral.template.task;

// Subclass - OfficeCleaning
class OfficeCleaning extends RoomCleaning {
    @Override
    protected void specificCleaning() {
        System.out.println("Cleaning desks and organizing documents.");
    }
}
