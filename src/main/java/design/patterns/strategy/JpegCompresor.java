package design.patterns.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JpegCompresor implements Compressor{
    @Override
    public void apply(String fileName) {
        log.info("Applying Jpeg Compression on file = " + fileName);
    }
}
