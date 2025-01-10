package creational.abstractfactory.task;

public class ElectricVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new ElectricVehicle();
    }

    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }
}
