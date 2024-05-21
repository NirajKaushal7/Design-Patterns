package design.patterns;

import design.patterns.momento.Store;
import design.patterns.momento.Updator;
import design.patterns.momento.UpdatorState;

public class BaseClass {
    public void momento(){
        Updator updator = new Updator();
        Store store = new Store();
        updator.setValue("a");
        store.push(updator.createUpdatorState());
        updator.setValue("b");
        store.push(updator.createUpdatorState());
        updator.setValue("c");
        updator.restoreUpdatorState(store.pop());
    }
}
