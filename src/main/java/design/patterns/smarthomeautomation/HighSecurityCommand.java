package design.patterns.smarthomeautomation;

public class HighSecurityCommand implements SecurityCommand {
    private SecuritySystem securitySystem;

    public HighSecurityCommand(SecuritySystem securitySystem) {
        this.securitySystem = securitySystem;
    }

    @Override
    public void execute() {
        securitySystem.activateHighSecurity();
    }
}

