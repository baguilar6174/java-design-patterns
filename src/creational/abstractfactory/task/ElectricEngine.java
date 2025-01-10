package creational.abstractfactory.task;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting electric motor...");
    }
}
