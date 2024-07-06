package design.patterns.smarthomeautomation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SecuritySystem {
    public void activateLowSecurity() {
        log.info("Low security system activated");
    }

    public void activateHighSecurity() {
        log.info("High security system activated");
    }
}

