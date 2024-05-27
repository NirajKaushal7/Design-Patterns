package design.patterns.smarthomeautomation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SyskaLight implements Light {
    private boolean isOn;
    @Override
    public void execute() {
        isOn = !isOn;
        String messsage = isOn ? "on" : "off";
        log.info("Syska light is " + messsage);
    }
}
