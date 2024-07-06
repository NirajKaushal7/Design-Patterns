package design.patterns.smarthomeautomation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuickCoolStrategy implements TemperatureControl {
    @Override
    public void regulate() {
        log.info("Quick cool temperature regulation");
    }
}

