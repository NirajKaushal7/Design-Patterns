package design.patterns.smarthomeautomation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EcoFriendlyStrategy implements TemperatureControl {
    @Override
    public void regulate() {
        log.info("Eco-friendly temperature regulation");
    }
}

