package design.patterns.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class ModernPrinter {
    void printDocument(String document) {
        log.info("Printing with modern printer: " + document);
    }
}
