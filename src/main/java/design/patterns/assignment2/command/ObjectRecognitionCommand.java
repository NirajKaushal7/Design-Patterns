package design.patterns.assignment2.command;

class ObjectRecognitionCommand implements CostlyCommand {
    private String image;
    private double cost = 20.0;

    public ObjectRecognitionCommand(String image) {
        this.image = image;
    }

    @Override
    public void execute() {
        System.out.println("Recognizing objects in image " + image);
    }

    @Override
    public double getCost() {
        return cost;
    }
}
