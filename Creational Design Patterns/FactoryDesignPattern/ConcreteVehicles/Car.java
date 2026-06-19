package FactoryDesignPattern.ConcreteVehicles;

import FactoryDesignPattern.Vehicle;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car has started");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");
    }
}
