package CompositeDesignPattern.ConcreteDevices;

import CompositeDesignPattern.SmartComponent;

public class AirConditioner implements SmartComponent {
    @Override
    public void turnOn() {
        System.out.println("AC is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("AC is turning off");
    }
}
