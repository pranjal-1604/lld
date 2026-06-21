package CompositeDesignPattern.ConcreteDevices;

import CompositeDesignPattern.SmartComponent;

public class SmartLight implements SmartComponent {
    @Override
    public void turnOn() {
        System.out.println("Smart light is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart light is turning off");
    }
}
