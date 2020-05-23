package ruslan.simakov.sadapter;

import java.util.List;

public class Adapter implements BookPrinter {

    @Override
    public void print(List<String> book) {
        Printer printer = new Printer();
        for (String s:book) {
            printer.print(s);
        }
    }
}
