package FactoryDesignPattern.ConcreteVehicles;

import FactoryDesignPattern.Vehicle;

public class Bus implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bus has started");
    }

    @Override
    public void stop() {
        System.out.println("Bus has stopped");
    }
}
