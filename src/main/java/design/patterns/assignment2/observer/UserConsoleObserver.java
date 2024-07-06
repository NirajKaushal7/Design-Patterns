package design.patterns.assignment2.observer;

public class UserConsoleObserver implements Observer {
    @Override
    public void update(String status) {
        System.out.println("Operation Status: " + status);
    }
}
