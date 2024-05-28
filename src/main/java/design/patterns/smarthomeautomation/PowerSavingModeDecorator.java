package design.patterns.smarthomeautomation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PowerSavingModeDecorator extends SmartDeviceDecorator {
    public PowerSavingModeDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void on() {
        super.on();
        log.info("Power-saving mode activated");
    }
}

