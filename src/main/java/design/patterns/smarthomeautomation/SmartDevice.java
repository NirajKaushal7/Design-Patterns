package design.patterns.smarthomeautomation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SmartDevice {
    public void on() {
        log.info("Device is on");
    }

    public void off() {
        log.info("Device is off");
    }
}

