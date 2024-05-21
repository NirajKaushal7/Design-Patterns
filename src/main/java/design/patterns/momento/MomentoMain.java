package design.patterns.momento;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MomentoMain {
    private MomentoMain(){}
    public static void main(){
        Updator updator = new Updator();
        Store store = new Store();
        updator.setValue("a");
        log.info(updator.getValue());
        store.push(updator.createUpdatorState());
        updator.setValue("b");
        log.info(updator.getValue());
        store.push(updator.createUpdatorState());
        updator.setValue("c");
        log.info(updator.getValue());
        updator.restoreUpdatorState(store.pop());
        log.info("Undo");
        log.info(updator.getValue());
        updator.restoreUpdatorState(store.pop());
        log.info("Undo");
        log.info(updator.getValue());
    }
}
