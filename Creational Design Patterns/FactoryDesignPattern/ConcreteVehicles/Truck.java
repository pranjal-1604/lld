package FactoryDesignPattern.ConcreteVehicles;

import FactoryDesignPattern.Vehicle;

public class Truck implements Vehicle {

    @Override
    public void start() {
        System.out.println("Truck has started");
    }

    @Override
    public void stop() {
        System.out.println("Truck has stopped");
    }
}
