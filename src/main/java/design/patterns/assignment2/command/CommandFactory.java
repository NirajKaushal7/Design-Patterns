package design.patterns.assignment2.command;

import design.patterns.assignment2.additional.DownloadCommand;


public class CommandFactory {

    private String serviceProvider;

    public CommandFactory() {
            this.serviceProvider = "Canva";
    }

    public Command createCommand(String commandType, String[] args) {
        switch (commandType) {
            case "resize":
                return new ResizeCommand(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            case "extend":
//                return new ExtendCommand(args[0], args[1], Integer.parseInt(args[2]), args[3]);// 1st way
                return new ExtendCommand(args[0], args[1], Integer.parseInt(args[2]), serviceProvider);
            case "crop":
                return new CropCommand(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]));
            case "remove-bg":
//                return new RemoveBgCommand(args[0], args[1]); // 1 st way
                return new RemoveBgCommand(args[0], serviceProvider);
            case "object-recognition":
                return new ObjectRecognitionCommand(args[0]);
            case "store-google-drive":
                return new StoreInGoogleDriveCommand(args[0], args[1]);
            case "store-aws-s3":
                return new StoreInAWSS3Command(args[0], args[1], args[2]);
            case "download-result":
                return new DownloadCommand(args[0], args[1]);
            default:
                throw new IllegalArgumentException("Unknown command type: " + commandType);
        }
    }
    public String getServiceProvider() {

        return serviceProvider;
    }
    public void setServiceProvider(String serviceProvider) {

        this.serviceProvider = serviceProvider;
    }
}
