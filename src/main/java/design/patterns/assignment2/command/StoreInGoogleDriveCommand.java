package design.patterns.assignment2.command;

class StoreInGoogleDriveCommand implements Command {
    private String image;
    private String path;

    public StoreInGoogleDriveCommand(String image, String path) {
        this.image = image;
        this.path = path;
    }

    @Override
    public void execute() {
        System.out.println("Storing image " + image + " in Google Drive at " + path);
    }
}
