package design.patterns.momento;

public class Updator {
private String value;

    public UpdatorState createUpdatorState(){
        return new UpdatorState(value);
    }
    public void restoreUpdatorState(UpdatorState updatorState){
        value = updatorState.getValue();
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
