package AdapterDesignPattern.ConcreteAdapters;

import AdapterDesignPattern.ConcreteDevices.SmartLight;
import AdapterDesignPattern.SmartDevice;

public class SmartLightAdapter implements SmartDevice {
    private  final SmartLight smartLight;

    public SmartLightAdapter(SmartLight smartLight) {
        this.smartLight = smartLight;
    }

    @Override
    public void turnOn() {
        smartLight.connectToWiFi();
        smartLight.switchOn();
    }

    @Override
    public void turnOff() {
       smartLight.disconnectWiFi();
       smartLight.switchOff();
    }
}
