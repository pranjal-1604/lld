package AdapterDesignPattern;

import CompositeDesignPattern.ConcreteDevices.AirConditioner;

public class AirConditionerAdapter implements SmartDevice{
    AirConditioner airConditioner;

    public AirConditionerAdapter(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void turnOn() {
        airConditioner.connectViaBluetooth();
    }

    @Override
    public void turnOff() {

    }
}
