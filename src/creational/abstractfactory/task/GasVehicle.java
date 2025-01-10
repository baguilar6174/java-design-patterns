package creational.abstractfactory.task;

public class GasVehicle implements Vehicle{
    @Override
    public void assemble() {
        System.out.println("Assembling a combustion car...");
    }
}
