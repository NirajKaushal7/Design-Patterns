package design.patterns.strategy;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Lark implements Filter{
    @Override
    public void apply(String fileName) {
        log.info("Applying Lark filter on file +"+fileName);
    }
}
