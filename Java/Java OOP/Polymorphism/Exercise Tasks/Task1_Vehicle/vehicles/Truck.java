package vehicles;

public class Truck extends Vehicle {

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public void setFuelConsumption(double consumption) {
        super.setFuelConsumption(consumption + 1.6);
    }

    @Override
    public String drive (double distance) {
        return "Truck " + super.drive(distance);
    }

    @Override
    public void refuel(double litres){
        super.refuel(litres * 0.95);
    }
}
