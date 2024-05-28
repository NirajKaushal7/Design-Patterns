package design.patterns.smarthomeautomation;

public class LowSecurityCommand implements SecurityCommand {
    private SecuritySystem securitySystem;

    public LowSecurityCommand(SecuritySystem securitySystem) {
        this.securitySystem = securitySystem;
    }

    @Override
    public void execute() {
        securitySystem.activateLowSecurity();
    }
}

