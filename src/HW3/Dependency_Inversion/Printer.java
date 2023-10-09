package HW3.Dependency_Inversion;

public class Printer {
    TextPrinter textPrinter;
    public Printer(TextPrinter textPrinter) {
        this.textPrinter = textPrinter;
    }
    public void print(Text text) {
        textPrinter.print(text.getText());
    }
}
