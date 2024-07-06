package design.patterns.smarthomeautomation;

public class SmartThermostat {
    private TemperatureControl strategy;

    public SmartThermostat(TemperatureControl strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(TemperatureControl strategy) {
        this.strategy = strategy;
    }

    public void regulate() {
        strategy.regulate();
    }
}
