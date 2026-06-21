package AdapterDesignPattern.ConcreteAdapters;
import AdapterDesignPattern.ConcreteDevices.AirConditioner;
import AdapterDesignPattern.SmartDevice;

public class AirConditionerAdapter implements SmartDevice {
    private final AirConditioner airConditioner;

    public AirConditionerAdapter(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void turnOn() {
        airConditioner.connectViaBluetooth();
        airConditioner.startCooling();
    }

    @Override
    public void turnOff() {
        // Completing the contract by mapping turnOff to the AC's shutdown sequence
        airConditioner.stopCooling();
        airConditioner.disconnectBluetooth();
    }
}