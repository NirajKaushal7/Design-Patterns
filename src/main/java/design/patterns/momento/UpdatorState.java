package design.patterns.momento;

public class UpdatorState {
    private final String value;

    public UpdatorState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
