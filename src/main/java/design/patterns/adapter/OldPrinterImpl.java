package design.patterns.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class OldPrinterImpl implements OldPrinter {
    @Override
    public void print(String text) {
        log.info("Printing with old printer: " + text);
    }
}
