package design.patterns.smarthomeautomation;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    private List<DeviceCommand> commandList = new ArrayList<>();

    public void addCommand(DeviceCommand command) {
        commandList.add(command);
    }

    public void executeCommand() {
        for (DeviceCommand command : commandList) {
            command.execute();
        }
    }
}
