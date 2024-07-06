package design.patterns.smarthomeautomation;

public class VendorASmartDevice implements DeviceAdapter {
    private VendorA device;

    public VendorASmartDevice(VendorA device) {
        this.device = device;
    }

    @Override
    public void adapt() {
        device.on();
    }
}
