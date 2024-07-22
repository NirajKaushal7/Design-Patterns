package design.patterns.assignment2.command;

class RemoveBgCommand implements CostlyCommand {
    private String image;
    private String serviceProvider;
    private double cost = 15.0;

    public RemoveBgCommand(String image, String serviceProvider) {
        this.image = image;
        this.serviceProvider = serviceProvider;
    }
    public RemoveBgCommand(String image) {
        this.image = image;
    }

    @Override
    public void execute() {
        System.out.println("By using "+ serviceProvider +" removing background from image " + image);
    }
    @Override
    public double getCost() {
        return cost;
    }
}
