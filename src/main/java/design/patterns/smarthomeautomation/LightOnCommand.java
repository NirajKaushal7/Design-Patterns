package design.patterns.smarthomeautomation;

public class LightOnCommand implements DeviceCommand {
    private SmartDevice device;

    public LightOnCommand(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }
}

