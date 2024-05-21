package design.patterns.adapter;

public class AdapterMain {
    private AdapterMain(){}
    public static void main() {
        // Using the old printer directly
        OldPrinter oldPrinter = new OldPrinterImpl();
        oldPrinter.print("Old Hello, world!");

        // Using the modern printer through the adapter
        ModernPrinter modernPrinter = new ModernPrinter();
        OldPrinter adapter = new PrinterAdapter(modernPrinter);
        adapter.print("New Hello, world!");
    }
}
