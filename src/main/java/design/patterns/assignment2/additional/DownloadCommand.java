package design.patterns.assignment2.additional;

import design.patterns.assignment2.command.Command;

public class DownloadCommand implements Command {
    private String image;
    private String destinationPath;

    public DownloadCommand(String image, String destinationPath) {
        this.image = image;
        this.destinationPath = destinationPath;
    }

    @Override
    public void execute() {
        System.out.println("Downloading image " + image + " to " + destinationPath);
    }
}

