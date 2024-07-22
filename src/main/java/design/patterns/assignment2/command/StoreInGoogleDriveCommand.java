package design.patterns.assignment2.command;

class StoreInGoogleDriveCommand implements CostlyCommand {
    private String image;
    private String path;
    private long cost = 1;

    public StoreInGoogleDriveCommand(String image, String path) {
        this.image = image;
        this.path = path;
    }

    @Override
    public void execute() {
        System.out.println("Storing image " + image + " in Google Drive at " + path);
    }

    @Override
    public double getCost() {
        return cost;
    }
}
