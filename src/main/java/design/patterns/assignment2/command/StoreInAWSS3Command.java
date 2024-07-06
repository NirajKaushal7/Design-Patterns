package design.patterns.assignment2.command;

class StoreInAWSS3Command implements Command {
    private String image;
    private String bucket;
    private String key;

    public StoreInAWSS3Command(String image, String bucket, String key) {
        this.image = image;
        this.bucket = bucket;
        this.key = key;
    }

    @Override
    public void execute() {
        System.out.println("Storing image " + image + " in AWS S3 bucket " + bucket + " with key " + key);
    }
}
