package Nivel3;

public class Stop implements VehicleActions{

    @Override
    public void actionExecution(Vehicle vehicle) {
        System.out.println("The " + vehicle.getVehicleType() + " has stopped.");
    }
}