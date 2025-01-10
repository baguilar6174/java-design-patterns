package creational.abstractfactory.task;

public class ElectricVehicle implements Vehicle{
    @Override
    public void assemble() {
        System.out.println("Assembling an electric car...");
    }
}
