package HW3.Dependency_Inversion;

public class Main {
    public static void main(String[] args) {
        Text myText = new Text("Hello, world!");
        TextPrinter myTextPrinter = (TextPrinter) new ConsoleTextPrinter();
        Printer myPrinter = new Printer(myTextPrinter);

        myPrinter.print(myText); // Hello, world!
    }
}