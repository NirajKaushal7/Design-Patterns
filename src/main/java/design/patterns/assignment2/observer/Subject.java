package design.patterns.assignment2.observer;

interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(String status);
}
