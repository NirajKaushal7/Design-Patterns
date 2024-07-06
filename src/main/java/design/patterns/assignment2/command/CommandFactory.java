package design.patterns.assignment2.command;

import design.patterns.assignment2.additional.DownloadCommand;


public class CommandFactory {
    public static Command createCommand(String commandType, String[] args) {
        switch (commandType) {
            case "resize":
                return new ResizeCommand(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            case "extend":
                return new ExtendCommand(args[0], args[1], Integer.parseInt(args[2]));
            case "crop":
                return new CropCommand(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]));
            case "remove-bg":
                return new RemoveBgCommand(args[0]);
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
}
