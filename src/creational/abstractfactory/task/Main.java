package creational.abstractfactory.task;

public class Main {

    public static void build(VehicleFactory vehicleFactory) {
        Vehicle vehicle = vehicleFactory.createVehicle();
        Engine engine = vehicleFactory.createEngine();
        vehicle.assemble();
        engine.start();
    }

    public static void main(String[] args) {
        VehicleFactory electricVehicleFactory = new ElectricVehicleFactory();
        build(electricVehicleFactory);

        System.out.println("-----------------------");

        VehicleFactory gasVehicleFactory = new GasVehicleFactory();
        build(gasVehicleFactory);
    }
}
