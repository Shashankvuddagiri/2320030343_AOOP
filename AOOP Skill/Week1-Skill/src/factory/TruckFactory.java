package factory;

public class TruckFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
