package design.patterns.assignment2.command;

class ResizeCommand implements CostlyCommand {
    private String image;
    private int width;
    private int height;

    public ResizeCommand(String image, int width, int height) {
        this.image = image;
        this.width = width;
        this.height = height;
    }

    @Override
    public void execute() {
        System.out.println("Resizing image " + image + " to width " + width + " and height " + height);
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}