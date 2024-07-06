package design.patterns.assignment2.command;

class ExtendCommand implements Command {
    private String image;
    private String direction;
    private int pixels;
    private double cost = 10.0;

    public ExtendCommand(String image, String direction, int pixels) {
        this.image = image;
        this.direction = direction;
        this.pixels = pixels;
    }

    @Override
    public void execute() {
        System.out.println("Extending image " + image + " " + pixels + " pixels to the " + direction);
    }
}
