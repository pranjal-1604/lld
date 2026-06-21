package CompositeDesignPattern;

import CompositeDesignPattern.ConcreteDevices.AirConditioner;
import CompositeDesignPattern.ConcreteDevices.SmartLight;

public class SmartHomeController {
    public static void main(String[] args) {
        SmartComponent ac = new AirConditioner();
        SmartComponent smartLight = new SmartLight();
        CompositeSmartComponent room1 = new CompositeSmartComponent();
        room1.addComponents(ac);
        room1.addComponents(smartLight);
        CompositeSmartComponent room2 = new CompositeSmartComponent();
        room2.addComponents(new AirConditioner());
        room2.addComponents(new SmartLight());

        room1.turnOn();
        room1.turnOff();
        room2.turnOn();
        room2.turnOff();
    }
}
