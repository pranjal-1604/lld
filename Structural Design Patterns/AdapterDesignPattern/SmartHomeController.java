package AdapterDesignPattern;

import AdapterDesignPattern.ConcreteAdapters.AirConditionerAdapter;
import AdapterDesignPattern.ConcreteAdapters.CoffeeMachineAdapter;
import AdapterDesignPattern.ConcreteAdapters.SmartLightAdapter;
import AdapterDesignPattern.ConcreteDevices.AirConditioner;
import AdapterDesignPattern.ConcreteDevices.SmartLight;

public class SmartHomeController {
    public static void main(String[] args) {
        AirConditionerAdapter airConditionerAdapter = new AirConditionerAdapter(new AirConditioner());
        SmartLightAdapter smartLightAdapter = new SmartLightAdapter(new SmartLight());

        airConditionerAdapter.turnOn();
        airConditionerAdapter.turnOff();
        smartLightAdapter.turnOn();
        smartLightAdapter.turnOff();
    }
}
