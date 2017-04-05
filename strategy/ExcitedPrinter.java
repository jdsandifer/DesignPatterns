public class ExcitedPrinter implements Printer {
    public void print(String message) {
        System.out.println("YOU HAVE A MESSAGE!: " + message.toUpperCase());
    }
}
