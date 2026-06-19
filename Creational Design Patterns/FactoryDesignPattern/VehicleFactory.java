package FactoryDesignPattern;

import FactoryDesignPattern.ConcreteVehicles.Bus;
import FactoryDesignPattern.ConcreteVehicles.Car;
import FactoryDesignPattern.ConcreteVehicles.Truck;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("Car")){
            return new Car();
        }
        else if(vehicleType.equalsIgnoreCase("Truck")){
            return new Truck();
        }
        else if(vehicleType.equalsIgnoreCase("Bus")){
            return new Bus();
        }
        else{
            throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}
