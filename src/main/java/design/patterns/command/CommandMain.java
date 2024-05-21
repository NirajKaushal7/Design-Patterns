package design.patterns.command;

public class CommandMain {
    private CommandMain(){}
    public static void main(){
        Light light = new Light();

        Command turnOnCommand = new TurnOnCommand(light);
        Command turnOffCommand = new TurnOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnCommand);
        remoteControl.click();
        remoteControl.setCommand(turnOffCommand);
        remoteControl.click();
    }
}
