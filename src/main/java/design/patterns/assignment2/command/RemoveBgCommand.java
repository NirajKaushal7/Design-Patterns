package design.patterns.assignment2.command;

class RemoveBgCommand implements Command {
    private String image;
    private double cost = 15.0;

    public RemoveBgCommand(String image) {
        this.image = image;
    }

    @Override
    public void execute() {
        System.out.println("Removing background from image " + image);
    }
}
