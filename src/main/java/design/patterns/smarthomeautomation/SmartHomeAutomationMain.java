package design.patterns.smarthomeautomation;

public class SmartHomeAutomationMain {
    private SmartHomeAutomationMain(){}
    public static void main() {
        SmartDevice light = new SmartDevice();

        SmartDevice powerSavingLight = new PowerSavingModeDecorator(light);
        SmartDevice powerSavingAndVacationMode = new VacationModeDecorator(new PowerSavingModeDecorator(light));

        DeviceCommand noramalLightOn = new LightOnCommand(powerSavingLight);
        DeviceCommand noramalLightOff = new LightOffCommand(powerSavingLight);
        DeviceCommand advancedLightOn = new LightOnCommand(powerSavingAndVacationMode);
        DeviceCommand advancedLightOff = new LightOffCommand(powerSavingAndVacationMode);

        SmartHomeController controller = new SmartHomeController();
        controller.addCommand(noramalLightOn);
        controller.addCommand(noramalLightOff);
        controller.addCommand(advancedLightOn);
        controller.addCommand(advancedLightOff);

        controller.executeCommand();

        SecuritySystem securitySystem = new SecuritySystem();
        SecurityCommand lowSecurityCommand = new LowSecurityCommand(securitySystem);
        SecurityCommand highSecurityCommand = new HighSecurityCommand(securitySystem);
        highSecurityCommand.execute();
        lowSecurityCommand.execute();

        SmartThermostat thermostat = new SmartThermostat(new EcoFriendlyStrategy());
        thermostat.regulate();
        thermostat.setStrategy(new QuickCoolStrategy());
        thermostat.regulate();


        DeviceAdapter vendorAAdapter = new VendorASmartDevice(new VendorA());//Vender A has on method
        vendorAAdapter.adapt();

        DeviceAdapter vendorBAdapter = new VendorBSmartDevice(new VendorB());//Vender B has activate method
        vendorBAdapter.adapt();

    }
}
