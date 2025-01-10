package creational.abstractfactory.task;

public class GasEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting combustion engine...");
    }
}
