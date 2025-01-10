package creational.abstractfactory.task;

public class GasVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new GasVehicle();
    }

    @Override
    public Engine createEngine() {
        return new GasEngine();
    }
}
