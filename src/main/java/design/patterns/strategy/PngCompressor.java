package design.patterns.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PngCompressor implements Compressor{
    @Override
    public void apply(String fileName) {
        log.info("Applying Png Compression on file = " + fileName);
    }
}
