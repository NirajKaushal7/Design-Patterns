package design.patterns.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        log.info("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}

