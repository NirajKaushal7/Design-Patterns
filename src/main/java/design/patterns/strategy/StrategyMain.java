package design.patterns.strategy;

public class StrategyMain {
    private StrategyMain(){}
    public static void main(){
        ImageStorage storage = new ImageStorage(new JpegCompresor(),new Classic());
        storage.store("Policy");
    }
}
