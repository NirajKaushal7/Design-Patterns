package design.patterns.adapter;

class PrinterAdapter implements OldPrinter {
        private ModernPrinter modernPrinter;

        public PrinterAdapter(ModernPrinter modernPrinter) {

            this.modernPrinter = modernPrinter;
        }

        @Override
        public void print(String text) {

            modernPrinter.printDocument(text);
        }
}