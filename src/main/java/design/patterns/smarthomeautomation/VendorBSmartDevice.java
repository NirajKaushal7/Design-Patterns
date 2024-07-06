package design.patterns.smarthomeautomation;

public class VendorBSmartDevice implements DeviceAdapter {
    private VendorB device;

    public VendorBSmartDevice(VendorB device) {
        this.device = device;
    }

    @Override
    public void adapt() {
        device.activate();
    }
}

