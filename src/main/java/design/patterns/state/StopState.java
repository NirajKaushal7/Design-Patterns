package design.patterns.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        log.info("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
