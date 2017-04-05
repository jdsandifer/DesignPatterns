public class PrinterTest {
    public static void main(String[] args) {
        Printer office = new SimplePrinter();
        Printer excited = new ExcitedPrinter();
        Printer monty = new PythonPrinter();
        
        String theMessage = "When you hear the tone, the time will be Hammer Time!";
        
        office.print(theMessage);
        excited.print(theMessage);
        monty.print(theMessage);
        
        return;
    }
}
