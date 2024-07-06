package design.patterns.smarthomeautomation;

public abstract class SmartDeviceDecorator extends SmartDevice {
    protected SmartDevice decoratedDevice;

    protected SmartDeviceDecorator(SmartDevice device) {
        this.decoratedDevice = device;
    }

    @Override
    public void on() {
        decoratedDevice.on();
    }

    @Override
    public void off() {
        decoratedDevice.off();
    }
}

