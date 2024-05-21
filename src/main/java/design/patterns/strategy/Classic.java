package design.patterns.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Classic implements Filter{
    @Override
    public void apply(String fileName) {
        log.info("Applying classic filter on file = " + fileName);
    }
}
