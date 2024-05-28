package design.patterns.smarthomeautomation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VacationModeDecorator extends SmartDeviceDecorator {
    public VacationModeDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void on() {
        super.on();
        log.info("Vacation mode activated");
    }
}

