/**
 * An interface for objects that print messages.
 *
 * @author jdsandifer
 * @version 1.0
 */
public interface Printer {
  
  /**
   * The actual printing command - to the terminal, GUI, printer, or wherever.
   *
   * @param message The text to print.
   */
  void print(String message);
}
