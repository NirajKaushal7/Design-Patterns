package design.patterns.momento;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<UpdatorState> updatorStates= new ArrayList();
    public  void push(UpdatorState updatorState){
        updatorStates.add(updatorState);
    }
    public UpdatorState pop(){
        var lastIndex = updatorStates.size()-1;
        var updatorState = updatorStates.get(lastIndex);
        updatorStates.remove(lastIndex);
        return updatorState;
    }
}
