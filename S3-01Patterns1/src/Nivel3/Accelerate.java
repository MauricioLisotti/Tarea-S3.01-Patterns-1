package Nivel3;

public class Accelerate implements VehicleActions{

    @Override
    public void actionExecution(Vehicle vehicle) {
        System.out.println("The " + vehicle.getVehicleType() + " has accelerated.");
    }
}
