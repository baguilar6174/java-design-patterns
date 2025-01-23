package structural.facade.task;

public class ComputerFacade {

    private final CPU cpu = new CPU();
    private final HardDrive hardDrive = new HardDrive();
    private final Memory memory = new Memory();

    public void startComputer() {
        System.out.println("Starting computer...");
        this.memory.load(0, this.hardDrive.read(0, 1024));
        this.cpu.jump(0);
        this.cpu.execute();
        System.out.println("Computer ready!");
    }

    public void stopComputer() {
        System.out.println("\nStopping computer...");
        System.out.println("Saving data...");
        this.cpu.stopOperations();
        this.memory.free();
        this.hardDrive.close();
        System.out.println("Computer stopped!");
    }
}
