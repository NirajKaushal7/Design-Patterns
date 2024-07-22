package design.patterns.assignment2.command;

class ExtendCommand implements CostlyCommand {
    private String image;
    private String direction;
    private int pixels;
    private String serviceProvider;
    private double cost = 10.0;

    public ExtendCommand(String image, String direction, int pixels, String serviceProvider) {
        this.image = image;
        this.direction = direction;
        this.pixels = pixels;
        this.serviceProvider = serviceProvider;
    }
    public ExtendCommand(String image, String direction, int pixels) {
        this.image = image;
        this.direction = direction;
        this.pixels = pixels;
    }

    @Override
    public void execute() {
        System.out.println("By using "+ serviceProvider + " extending image " + image + " " + pixels + " pixels to the " + direction);
    }
    @Override
    public double getCost() {
        return cost;
    }
}
