package design.patterns.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StateMain {
    private StateMain(){}
    public static void main() {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        log.info(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        log.info(context.getState().toString());
}
}
