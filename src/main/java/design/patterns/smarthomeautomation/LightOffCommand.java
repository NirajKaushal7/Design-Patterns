package design.patterns.smarthomeautomation;

public class LightOffCommand implements DeviceCommand {
    private SmartDevice device;

    public LightOffCommand(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }
}

